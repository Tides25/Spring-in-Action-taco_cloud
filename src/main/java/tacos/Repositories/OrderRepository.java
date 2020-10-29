package tacos.Repositories;

import org.springframework.data.repository.CrudRepository;
import tacos.component.Order;

public interface OrderRepository extends CrudRepository<Order,Long> {

}
