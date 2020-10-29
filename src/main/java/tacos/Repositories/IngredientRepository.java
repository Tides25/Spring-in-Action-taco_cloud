package tacos.Repositories;

import org.springframework.data.repository.CrudRepository;
import tacos.component.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {

}
