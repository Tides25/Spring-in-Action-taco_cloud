package tacos.Repositories;

import org.springframework.data.repository.CrudRepository;
import tacos.component.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
