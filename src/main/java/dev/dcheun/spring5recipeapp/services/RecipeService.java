package dev.dcheun.spring5recipeapp.services;

import dev.dcheun.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
