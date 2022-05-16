package desafio_unidac.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import desafio_unidac.entities.Recipe;

@Repository
public interface RecipeRepository extends MongoRepository<Recipe, String>{
	

}
