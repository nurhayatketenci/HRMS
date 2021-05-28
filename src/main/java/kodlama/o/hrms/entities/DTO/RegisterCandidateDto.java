package kodlama.o.hrms.entities.DTO;

import lombok.Data;

import javax.persistence.Column;
import java.time.LocalDate;

@Data
public class RegisterCandidateDto {
    private String name;
    private String surname;
    private String nationalIdentity;
    private LocalDate birthYear;
    private String email;
    private String password;
    private String passwordConfirm;

}