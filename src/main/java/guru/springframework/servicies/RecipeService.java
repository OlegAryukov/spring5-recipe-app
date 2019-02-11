package guru.springframework.servicies;

import guru.springframework.domain.Recipe;

import java.util.Set;

/**
 * Created by oaryukov on 11.02.2019.
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
}
