package spboot.cg.niit.department.employee.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import spboot.cg.niit.department.employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> 
{

}
