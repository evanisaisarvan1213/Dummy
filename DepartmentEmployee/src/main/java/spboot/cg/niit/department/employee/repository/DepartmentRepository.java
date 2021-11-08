package spboot.cg.niit.department.employee.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import spboot.cg.niit.department.employee.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department,Integer> 
{

}
