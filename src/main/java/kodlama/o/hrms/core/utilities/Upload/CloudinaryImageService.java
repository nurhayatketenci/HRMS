package kodlama.o.hrms.core.utilities.Upload;

import kodlama.o.hrms.core.utilities.results.DataResult;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

public interface CloudinaryImageService {
    DataResult<Map> save(MultipartFile file);
}
