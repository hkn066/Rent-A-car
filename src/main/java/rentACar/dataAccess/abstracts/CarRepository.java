package rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import rentACar.entities.Car;

public interface CarRepository  extends JpaRepository<Car,Integer> {
    boolean existsByPlate(String plate);
    boolean existsById(int id);
}
