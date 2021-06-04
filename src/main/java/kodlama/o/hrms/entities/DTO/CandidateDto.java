package kodlama.o.hrms.entities.DTO;

import kodlama.o.hrms.entities.concretes.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CandidateDto {
    private Candidate candidate;
    private List<CandidateSchool> candidateSchools;
    private List<CandidateImage> candidateImages;
    private List<CandidateJobExperience> candidateJobExperiences;
    private List<CandidateLanguage> candidateLanguages;
    private List<CandidateLink> candidateLinks;
    private List<CandidateProgrammingInformation> candidateProgrammingInformations;
}