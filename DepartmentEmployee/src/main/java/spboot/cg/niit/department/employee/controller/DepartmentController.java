package spboot.cg.niit.department.employee.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spboot.cg.niit.department.employee.entity.Department;
import spboot.cg.niit.department.employee.service.DepartmentService;

@RestController
@RequestMapping("/Department")
public class DepartmentController 
{
	@Autowired
	DepartmentService deptservice;
	
	@GetMapping(value="/{dept_no}",produces="application/json")
	public ResponseEntity<Department> getDepartmentDetails(@PathVariable int dept_no)
	{
		Department dept = deptservice.getDepartment(dept_no);
		return new ResponseEntity<Department>(dept,HttpStatus.OK);
	}
	
	@GetMapping(produces="application/json")
	public ResponseEntity<List<Department>> getDeaprtmentsDetails()
	{
		return new ResponseEntity<List<Department>>(deptservice.getDepartments(),HttpStatus.OK);
	}
	
	@ExceptionHandler(RuntimeException.class)
	public HttpStatus exceptionHandlerMethod()
	{
		return HttpStatus.NO_CONTENT;
	}

}
