package kodlama.o.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "job_advertisements")
@NoArgsConstructor
@AllArgsConstructor
public class JobAdvertisement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @JoinColumn(name = "job_position_id")
    @ManyToOne()
    private JobPosition jobPosition;

    @JoinColumn(name = "city_id")
    @ManyToOne()
    private City city;

    @JoinColumn(name = "employer_id")
    @ManyToOne()
    private Employer employer;

    @Column(name = "application_deadline")
    private LocalDate applicationDeadline;

    @Column(name = "min_salary")
    private int minSalary;

    @Column(name = "max_salary")
    private int maxSalary;

    @Column(name = "description")
    private String description;

    @Column(name = "number_of_people")
    private int numberOfPeople;

    @Column(name="created_at", columnDefinition = "Date default CURRENT_DATE")
    private LocalDate createdAt = LocalDate.now();

    @Column(name="is_deleted", columnDefinition = "boolean default true")
    private boolean isDeleted=false;

    @Column(name = "is_active",columnDefinition = "boolean default true")
    private boolean isActive=true;


}
