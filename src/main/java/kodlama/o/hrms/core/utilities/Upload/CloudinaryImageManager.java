package kodlama.o.hrms.core.utilities.Upload;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import kodlama.o.hrms.core.utilities.results.DataResult;
import kodlama.o.hrms.core.utilities.results.ErrorDataResult;
import kodlama.o.hrms.core.utilities.results.SuccessDataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;


public class CloudinaryImageManager implements CloudinaryImageService {
    private Cloudinary cloudinary;

    @Autowired
    public CloudinaryImageManager(Cloudinary cloudinary) {
        this.cloudinary = cloudinary;
    }

    @Override
    public DataResult<Map> save(MultipartFile file) {
        try{
           Map upload=cloudinary.uploader().upload(file, ObjectUtils.emptyMap());
            return new SuccessDataResult<Map>(upload);
        }catch (Exception e){
            return new ErrorDataResult<>(e.getMessage());
        }
    }
}
