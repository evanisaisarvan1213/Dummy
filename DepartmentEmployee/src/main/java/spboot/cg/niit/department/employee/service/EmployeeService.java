package spboot.cg.niit.department.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spboot.cg.niit.department.employee.entity.Employee;
import spboot.cg.niit.department.employee.repository.EmployeeRepository;

@Service
public class EmployeeService 
{
	@Autowired
	EmployeeRepository emprep;
	
	@Transactional(readOnly=true)
	public Employee getEmployee(int emp_id)
	{
		Optional<Employee> emp = emprep.findById(emp_id);
		if(emp!=null)
			return emp.get();
		throw new RuntimeException("No Employee Found");
	}
	
	@Transactional(readOnly=true)
	public List<Employee> getEmployees()
	{
		List<Employee> elist = emprep.findAll();
		if(elist.size()>0)
			return elist;
		throw new RuntimeException("Employees Not Found");
	}

}
