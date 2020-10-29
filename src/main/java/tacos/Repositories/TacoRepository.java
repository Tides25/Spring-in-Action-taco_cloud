package tacos.Repositories;

import org.springframework.data.repository.CrudRepository;
import tacos.component.Taco;

public interface TacoRepository extends CrudRepository<Taco, Long> {
}
