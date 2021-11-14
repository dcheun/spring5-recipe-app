package dev.dcheun.spring5recipeapp.repositories;

import dev.dcheun.spring5recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
