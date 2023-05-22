package rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import rentACar.entities.IndividualUser;

public interface IndividualUserRepository extends JpaRepository<IndividualUser,Integer> {
}
