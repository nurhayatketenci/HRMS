package kodlama.o.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@PrimaryKeyJoinColumn(name="user_id")
@NoArgsConstructor
@AllArgsConstructor
@Table(name="candidates")

public class Candidate extends User {

    @Column(name="first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name="national_id")
    private String nationalId;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "description")
    private String description;


    @OneToMany(mappedBy = "candidate")
    private List<CandidateSchool> candidateSchools;

    @OneToMany(mappedBy = "candidate")
    private List<CandidateProgrammingInformation> candidateProgrammingInformations;

    @OneToMany(mappedBy = "candidate")
    private List<CandidateLanguage> candidateLanguages;

    @OneToMany(mappedBy = "candidate")
    private List<CandidateImage> candidateImages;

    @OneToMany(mappedBy = "candidate")
    private List<CandidateJobExperience> candidateJobExperiences;

    @OneToMany(mappedBy = "candidate")
    private List<CandidateLink> candidateLinks;






}
