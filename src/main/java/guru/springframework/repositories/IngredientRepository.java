package guru.springframework.repositories;

import guru.springframework.domain.Ingredient;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by oaryukov on 08.02.2019.
 */
public interface IngredientRepository extends CrudRepository<Ingredient, Long > {
}
