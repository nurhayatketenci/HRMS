package kodlama.o.hrms.business.abstracts;

import kodlama.o.hrms.core.utilities.results.Result;
import kodlama.o.hrms.entities.DTO.RegisterCandidateDto;
import kodlama.o.hrms.entities.DTO.RegisterEmployerDto;

public interface AuthService {
    Result login(String email);
    Result registerForEmployer(RegisterEmployerDto registerEmployerDto);
    Result registerForCandidate(RegisterCandidateDto registerCandidateDto);
}
