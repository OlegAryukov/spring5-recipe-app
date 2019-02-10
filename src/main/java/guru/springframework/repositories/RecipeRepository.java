package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by oaryukov on 08.02.2019.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
