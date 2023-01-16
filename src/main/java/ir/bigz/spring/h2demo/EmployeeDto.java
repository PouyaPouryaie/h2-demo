package ir.bigz.spring.h2demo;

import jakarta.persistence.Column;
import lombok.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {

    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
}
