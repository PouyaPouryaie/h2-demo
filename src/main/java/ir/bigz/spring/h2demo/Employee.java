package ir.bigz.spring.h2demo;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "EMPLOYEES", uniqueConstraints = {@UniqueConstraint(columnNames = "email", name = "employee_email_unique")})
@Data
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@Builder
public class Employee {

    @Id
    @SequenceGenerator(
            name = "employee_sequence",
            sequenceName = "employee_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "employee_sequence",
            strategy = GenerationType.SEQUENCE
    )
    @Column(name = "id", updatable = false)
    private Integer id;
    private String firstName;
    private String lastName;
    @Column(name = "email", nullable = false, columnDefinition = "TEXT")
    private String email;
}
