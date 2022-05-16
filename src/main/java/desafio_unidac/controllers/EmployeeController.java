package desafio_unidac.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import desafio_unidac.entities.Employee;
import desafio_unidac.services.EmployeeService;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Employee>> findAll(){
		List<Employee> list = employeeService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	

}
