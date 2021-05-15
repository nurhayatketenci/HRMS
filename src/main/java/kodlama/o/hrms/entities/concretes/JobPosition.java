package kodlama.o.hrms.entities.concretes;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;

@Entity
@Table(name = "job_positions")
@Data
public class JobPosition {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;


    @Column(name = "position")
    private String position;

}
