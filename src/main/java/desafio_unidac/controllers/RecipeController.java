package desafio_unidac.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import desafio_unidac.entities.Recipe;
import desafio_unidac.services.RecipeService;

@RestController
@RequestMapping(value="/recipes")
public class RecipeController {
	
	@Autowired
	private RecipeService recipeService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Recipe>> findAll(){
		List<Recipe> list = recipeService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	

}
