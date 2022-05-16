package desafio_unidac.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import desafio_unidac.entities.Employee;
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
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> addRecipe(@RequestBody Recipe recipe){
		recipeService.addRecipe(recipe);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(recipe.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteRecipe(@PathVariable String id){
		recipeService.deleteRecipe(id);
		return ResponseEntity.noContent().build();
	}
	

}
