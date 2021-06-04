package kodlama.o.hrms.business.concrete;

import kodlama.o.hrms.business.abstracts.CandidateImageService;
import kodlama.o.hrms.core.utilities.Upload.CloudinaryImageService;
import kodlama.o.hrms.core.utilities.results.DataResult;
import kodlama.o.hrms.core.utilities.results.Result;
import kodlama.o.hrms.core.utilities.results.SuccessDataResult;
import kodlama.o.hrms.core.utilities.results.SuccessResult;
import kodlama.o.hrms.dataAccess.abstracts.CandidateImageDao;
import kodlama.o.hrms.entities.concretes.CandidateImage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Service
public class CandidateImageManager implements CandidateImageService {
    private CandidateImageDao candidateImageDao;
    private CloudinaryImageService cloudinaryImageService;

    @Autowired
    public CandidateImageManager(CandidateImageDao candidateImageDao, CloudinaryImageService cloudinaryImageService) {
        this.candidateImageDao = candidateImageDao;
        this.cloudinaryImageService = cloudinaryImageService;
    }

    @Override
    public Result add(CandidateImage candidateImage, MultipartFile multipartFile) {
        Map result = (Map<String,String>) this.cloudinaryImageService.save(multipartFile).getData();
        String imageUrl = result.get("url").toString();
        candidateImage.setImagePath(imageUrl);
        candidateImage.setCreatedAt(LocalDate.now());
        this.candidateImageDao.save(candidateImage);
        return new SuccessResult("Image uploaded.");
    }

    @Override
    public DataResult<List<CandidateImage>> getAll() {

        return new SuccessDataResult<List<CandidateImage>>(candidateImageDao.findAll());
    }

    @Override
    public DataResult<List<CandidateImage>> getAllByCandidateId(int candidateId) {
        return new SuccessDataResult<>(candidateImageDao.getAllByCandidateId(candidateId));
    }
}
