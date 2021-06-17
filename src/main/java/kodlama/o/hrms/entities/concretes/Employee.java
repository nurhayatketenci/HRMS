package kodlama.o.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employees")
public class Employee extends User{

    @Column(name = "first_name")
   private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name="created_at", columnDefinition = "Date default CURRENT_DATE")
    private LocalDate createdAt = LocalDate.now();

    @OneToMany(mappedBy = "employee")
    @JsonIgnore()
    private List<JobAdvertisementConfirmation> jobAdvertisementConfirmationList;


}
