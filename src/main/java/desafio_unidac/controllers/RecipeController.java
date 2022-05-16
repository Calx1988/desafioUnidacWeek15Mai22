package desafio_unidac.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import desafio_unidac.repositories.RecipeRepository;

@Controller
public class RecipeController {
	
	private RecipeRepository recipeRepository;

	public RecipeController() {
	}

	public RecipeController(RecipeRepository recipeRepository) {
		this.recipeRepository = recipeRepository;
	}
	
	public String employees(Model model) {
		model.addAttribute("listRecipe", recipeRepository.findAll());
		return "recipe/recipeIndex";
	}
	
	

}
