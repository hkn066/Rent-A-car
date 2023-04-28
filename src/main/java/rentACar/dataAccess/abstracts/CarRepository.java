package rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import rentACar.entities.Car;

public interface CarRepository  extends JpaRepository<Car,Integer> {
}
