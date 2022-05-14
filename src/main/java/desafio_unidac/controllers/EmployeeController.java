package desafio_unidac.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import desafio_unidac.repositories.EmployeeRepository;

@Controller
public class EmployeeController {
	
	private EmployeeRepository employeeRepository;

	public EmployeeController() {
	}

	public EmployeeController(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	public String employees(Model model) {
		model.addAttribute("listEmployee", employeeRepository.findAll());
		return "employee/employeeIndex";
	}
	
	

}
