package spboot.cg.niit.department.employee.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee 
{
	@Id
	@Column(name="emp_id")
	int emp_id;
	
	@Column(name="emp_name")
	String emp_name;
	
	@Column(name="emp_sal")
	double salary;
	
	@ManyToOne
	@JoinColumn(name="dept_no")
	Department department;

	

	public Employee(int emp_id, String emp_name, double salary) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.salary = salary;
	}
	
	

	public int getEmp_id() {
		return emp_id;
	}



	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}



	public String getEmp_name() {
		return emp_name;
	}



	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}



	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
	

}
