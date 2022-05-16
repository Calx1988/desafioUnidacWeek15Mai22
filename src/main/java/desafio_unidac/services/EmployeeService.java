package desafio_unidac.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import desafio_unidac.entities.Employee;
import desafio_unidac.repositories.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}
	
	public Employee addEmployee(Employee e) {
		return employeeRepository.insert(e);
	}
	
	public void deleteEmployee(String id) {
		employeeRepository.deleteById(id);
	}

}
