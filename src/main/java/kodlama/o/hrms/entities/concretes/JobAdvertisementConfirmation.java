package kodlama.o.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "job_Advertisement_confirmation")
@NoArgsConstructor
@AllArgsConstructor

public class JobAdvertisementConfirmation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name="is_confirm")
    private boolean isConfirm=false;

    @Column(name="created_at")
    private LocalDate createdAt = LocalDate.now();

    @ManyToOne()
    @JoinColumn(name = "employee_id")
    private Employee employee;


    @OneToOne( fetch = FetchType.LAZY)
    @JsonBackReference
    @JoinColumn(name = "job_advertisement_id")
    private JobAdvertisement jobAdvertisement;

}
