package kodlama.o.hrms.entities.DTO;

import lombok.Data;

import javax.persistence.Column;
@Data
public class RegisterEmployerDto {
    private String webAddress;
    private String phoneNumber;
    private String companyName;
    private String email;
    private String password;
    private String passwordConfirm;
}
