package desafio_unidac.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import desafio_unidac.entities.Recipe;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long>{
	

}
