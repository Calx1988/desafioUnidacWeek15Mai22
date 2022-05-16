package desafio_unidac.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import desafio_unidac.entities.Employee;
import desafio_unidac.repositories.EmployeeRepository;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {
	
	private EmployeeRepository employeeRepository;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Employee>> findAll(){
		Employee e1 = new Employee(null, "Cássio Corrêa", "12345678901");
		Employee e2 = new Employee(null, "Natalia Corrêa", "23456789012");
		List<Employee> list = new ArrayList<>();
		list.addAll(Arrays.asList(e1,e2));
		return ResponseEntity.ok().body(list);
	}
	
	

}
