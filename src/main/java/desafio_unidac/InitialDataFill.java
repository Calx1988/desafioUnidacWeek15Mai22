package desafio_unidac;

import java.lang.reflect.Array;
import java.util.Arrays;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import desafio_unidac.entities.Employee;
import desafio_unidac.repositories.EmployeeRepository;
import desafio_unidac.repositories.RecipeRepository;

@Component
@Transactional
public class InitialDataFill implements CommandLineRunner{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private RecipeRepository recipeRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Employee e1 = new Employee(null, "Cassio Corrêa", "12345678901");
		Employee e2 = new Employee(null, "Fernanda Fiuza", "24680246802");
		
		employeeRepository.saveAll(Arrays.asList(e1,e2));
		
	}
	
}
