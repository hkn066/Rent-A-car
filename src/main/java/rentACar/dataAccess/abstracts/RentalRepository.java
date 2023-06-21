package rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import rentACar.entities.Rental;

public interface RentalRepository  extends JpaRepository<Rental,Integer> {

}
