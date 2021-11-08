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

import spboot.cg.niit.department.employee.entity.Employee;
import spboot.cg.niit.department.employee.service.EmployeeService;

@RestController
@RequestMapping("/Employee")
public class EmployeeController 
{
	@Autowired
	EmployeeService empservice;
	
	@GetMapping(value="/{emp_id}",produces="application/json")
	public ResponseEntity<Employee> getEmployeeDetails(@PathVariable int emp_id)
	{
		Employee emp = empservice.getEmployee(emp_id);
		return new ResponseEntity<Employee>(emp,HttpStatus.OK);
	}
	
	@GetMapping(produces="application/json")
	public ResponseEntity<List<Employee>> getDeaprtmentsDetails()
	{
		return new ResponseEntity<List<Employee>>(empservice.getEmployees(),HttpStatus.OK);
	}
	
	@ExceptionHandler(RuntimeException.class)
	public HttpStatus exceptionHandlerMethod()
	{
		return HttpStatus.NO_CONTENT;
	}

}
