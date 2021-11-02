package spring.spring.DTO;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@Data
@Builder
public class UserDTO {
    private Integer id;
    private String name;
    private String email;
    private LocalDate birthDate;

    public UserDTO(Integer id, String name, String email, LocalDate birthDate) {
        this.id=id;
        this.name=name;
        this.email = email;
        this.birthDate = birthDate;
    }
}
