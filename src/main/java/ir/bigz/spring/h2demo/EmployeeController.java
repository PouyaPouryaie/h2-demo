package ir.bigz.spring.h2demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeRepo employeeRepo;

    public EmployeeController(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @GetMapping
    public ResponseEntity<?> getAllEmployees() {
        return ResponseEntity.ok(employeeRepo.findAll());
    }

    @PostMapping
    public ResponseEntity<?> addEmployee(@RequestBody EmployeeDto employee) {
        return ResponseEntity.ok(
                employeeRepo.save(
                        Employee.builder()
                                .email(employee.getEmail())
                                .lastName(employee.getLastName())
                                .firstName(employee.getFirstName())
                                .build()));
    }
}
