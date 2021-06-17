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
@Table(name = "employment_types")
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisements"})

public class EmploymentType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name="name")
    private String name;

    @OneToMany(mappedBy = "employmentType")
    private List<JobAdvertisement> jobAdvertisements;

    @Column(name="created_at", columnDefinition = "Date default CURRENT_DATE")
    private LocalDate createdAt = LocalDate.now();

    @Column(name="is_deleted", columnDefinition = "boolean default true")
    private boolean isDeleted=false;

    @Column(name = "is_active",columnDefinition = "boolean default true")
    private boolean isActive=true;


}


