package rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import rentACar.entities.CorporateUser;

public interface CorporateUserRepository extends JpaRepository<CorporateUser,Integer> {
}
