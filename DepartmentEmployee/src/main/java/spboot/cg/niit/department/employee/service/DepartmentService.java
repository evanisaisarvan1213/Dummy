package spboot.cg.niit.department.employee.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spboot.cg.niit.department.employee.entity.Department;
import spboot.cg.niit.department.employee.repository.DepartmentRepository;
@Service
public class DepartmentService 
{
	@Autowired
	DepartmentRepository departrep;
	
	@Transactional(readOnly=true)
	public Department getDepartment(int dept_no)
	{
		Optional<Department> dep = departrep.findById(dept_no);
		if(dep!=null)
			return dep.get();
		throw new RuntimeException("Department Not Found");
	}
	
	@Transactional(readOnly=true)
	public List<Department> getDepartments()
	{
		List<Department> dlist = departrep.findAll();
		if(dlist.size()>0)
			return dlist;
		throw new RuntimeException("No Department Found");
	}

}
