package spboot.cg.niit.department.employee.entity;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department 
{
	@Id
	@Column(name="dept_no")
	int dept_no;
	
	@Column(name="dept_name")
	String dept_name;
	
	@Column(name="dept_loc")
	String dept_loc;
	
	@OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL,mappedBy="department")
	List<Employee> employee;

	

	public Department(int dept_no, String dept_name, String dept_loc, List<Employee> employee) {
		this.dept_no = dept_no;
		this.dept_name = dept_name;
		this.dept_loc = dept_loc;
		this.employee = employee;
	}
	
	

	
	public int getDept_no() {
		return dept_no;
	}




	public void setDept_no(int dept_no) {
		this.dept_no = dept_no;
	}




	public String getDept_name() {
		return dept_name;
	}




	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}




	public String getDept_loc() {
		return dept_loc;
	}




	public void setDept_loc(String dept_loc) {
		this.dept_loc = dept_loc;
	}




	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	
	
	
	
}
