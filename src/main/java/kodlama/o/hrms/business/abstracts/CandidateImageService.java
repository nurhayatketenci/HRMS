package kodlama.o.hrms.business.abstracts;

import kodlama.o.hrms.core.utilities.Results.DataResult;
import kodlama.o.hrms.core.utilities.Results.Result;
import kodlama.o.hrms.entities.concretes.CandidateImage;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface CandidateImageService {
    Result add(CandidateImage candidateImage, MultipartFile multipartFile);
    DataResult<List<CandidateImage>> getAll();
    DataResult<List<CandidateImage>> getAllByCandidateId(int candidateId);


}
