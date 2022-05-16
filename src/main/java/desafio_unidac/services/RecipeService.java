package desafio_unidac.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import desafio_unidac.entities.Recipe;
import desafio_unidac.repositories.RecipeRepository;

@Service
public class RecipeService {
	
	@Autowired
	private RecipeRepository recipeRepository;
	
	public List<Recipe> findAll(){
		return recipeRepository.findAll();
	}

}
