package kodlama.o.hrms.core.utilities.Upload;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import kodlama.o.hrms.core.utilities.Results.DataResult;
import kodlama.o.hrms.core.utilities.Results.ErrorDataResult;
import kodlama.o.hrms.core.utilities.Results.SuccessDataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@Service
public class CloudinaryImageManager implements CloudinaryImageService {
    private Cloudinary cloudinary;

    @Autowired
    public CloudinaryImageManager(Cloudinary cloudinary) {
        this.cloudinary = cloudinary;
    }

    @Override
    public DataResult<Map> save(MultipartFile file) {
        try{
           Map upload=cloudinary.uploader().upload(file.getBytes(), ObjectUtils.emptyMap());
            return new SuccessDataResult<Map>(upload);
        }catch (Exception e){
            e.printStackTrace();
            return new ErrorDataResult<>(e.getMessage());
        }
    }
}
