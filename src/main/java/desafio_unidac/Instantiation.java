package desafio_unidac;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import desafio_unidac.entities.Employee;
import desafio_unidac.entities.Recipe;
import desafio_unidac.repositories.EmployeeRepository;
import desafio_unidac.repositories.RecipeRepository;

public class Instantiation implements CommandLineRunner{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private RecipeRepository recipeRepository;

	@Override
	public void run(String... args) throws Exception {
		
		employeeRepository.deleteAll();
		Employee e1 = new Employee(null, "Cássio Alexsander", "12345678901");
		Employee e2 = new Employee(null, "Julya Branicki", "23456789012");
		Employee e3 = new Employee(null, "Allana Caroline", "34567890123");
		Employee e4 = new Employee(null, "Marta Inez", "45678901234");
		Employee e5 = new Employee(null, "Natalia Krostovic", "56789012345");
		employeeRepository.saveAll(Arrays.asList(e1,e2,e3,e4,e5));
		
		recipeRepository.deleteAll();
		Recipe r1 = new Recipe(null, "Torta de Chocolate");
		Recipe r2 = new Recipe(null, "Torta de Morango");
		Recipe r3 = new Recipe(null, "Risólis de Frango");
		Recipe r4 = new Recipe(null, "Pastel de Carne");
		Recipe r5 = new Recipe(null, "Pão de Queijo");
		recipeRepository.saveAll(Arrays.asList(r1,r2,r3,r4,r5));

		
	}

}
