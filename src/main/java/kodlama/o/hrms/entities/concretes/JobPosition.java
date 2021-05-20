package kodlama.o.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "job_positions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobPosition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int  id;


    @Column(name = "position")
    private String position;

}
