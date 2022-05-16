/*package desafio_unidac;

import java.util.Arrays;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import desafio_unidac.entities.Employee;
import desafio_unidac.entities.Recipe;
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
		Employee e2 = new Employee(null, "Domingo Félix de Guzmán", "24680246802");
		Employee e3 = new Employee(null, "Isabel de Aragón", "13579135791");
		Employee e4 = new Employee(null, "Alfonso Sanches", "24680246802");


		
		employeeRepository.saveAll(Arrays.asList(e1,e2,e3,e4));
		
		Recipe r1= new Recipe(null, "Torta de Chocolate");
		Recipe r2= new Recipe(null, "Torta de Morango");
		Recipe r3= new Recipe(null, "Risólis de Frango");
		Recipe r4= new Recipe(null, "Risólis de Carne");
		Recipe r5= new Recipe(null, "Quindim");


		recipeRepository.saveAll(Arrays.asList(r1,r2,r3,r4,r5));



	}
	
}
