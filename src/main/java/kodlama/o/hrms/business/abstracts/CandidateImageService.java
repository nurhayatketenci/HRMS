package kodlama.o.hrms.business.abstracts;

import kodlama.o.hrms.core.utilities.results.DataResult;
import kodlama.o.hrms.core.utilities.results.Result;
import kodlama.o.hrms.entities.concretes.CandidateImage;
import kodlama.o.hrms.entities.concretes.Employer;
import org.apache.james.mime4j.dom.Multipart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface CandidateImageService {
    Result add(CandidateImage candidateImage, MultipartFile multipartFile);
    DataResult<List<CandidateImage>> getAll();
    DataResult<List<CandidateImage>> getAllByCandidateId(int candidateId);


}
