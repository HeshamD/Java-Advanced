package platinumMind.example.employerManager.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import platinumMind.example.employerManager.Models.Employee;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {
    void deleteEmployeeById(Long id);
    Optional<Employee> findEmployeeById(Long id);
}
