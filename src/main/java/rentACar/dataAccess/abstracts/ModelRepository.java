package rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import rentACar.entities.Model;

public interface ModelRepository extends JpaRepository<Model, Integer> {

    boolean existsByName(String name);

    boolean existsById(Integer id);
}
