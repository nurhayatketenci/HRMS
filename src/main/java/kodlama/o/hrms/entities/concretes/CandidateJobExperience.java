package kodlama.o.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "candidate_job_experiences")
public class CandidateJobExperience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "company")
    @NotNull
    @NotBlank
    private String companyName;

    @Column(name = "department")
    @NotNull
    @NotBlank
    private String department;

    @Column(name = "start_date")
    @NotNull
    @NotBlank
    private LocalDate startingDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name="created_at", columnDefinition = "Date default CURRENT_DATE")
    private LocalDate createdAt = LocalDate.now();

    //Proje entitysini yüklediğimizde ilişkili olduğu tablonunda yüklenmesini istiyorsak FetchType tipini fetch=FetchType.EAGER olarak belirleriz.
    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore()
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;



}
