package rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import rentACar.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
