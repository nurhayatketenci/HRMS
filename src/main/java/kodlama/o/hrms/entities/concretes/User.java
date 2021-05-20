package kodlama.o.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
@Data
public class User {

    @Id
    @Column(name="id")
    private int id;

    @Column(name = "mail")
    private String  mail;

    @Column(name = "password")
    private String password;

}
