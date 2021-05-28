package kodlama.o.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name="job_positions")
@AllArgsConstructor
@NoArgsConstructor
public class JobPosition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="job_title")
    private String jobTitle;

    @Column(name="created_at", columnDefinition = "Date default CURRENT_DATE")
    private LocalDate createdAt = LocalDate.now();

    @Column(name="is_verified", columnDefinition = "boolean default true")
    private boolean isVerified = true;

    @Column(name="is_deleted", columnDefinition = "boolean default true")
    private boolean isDeleted=false;

}
