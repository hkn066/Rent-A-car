package kodlama.io.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.rentACar.entities.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer> {
	boolean existsByName(String name);//spring JPA Keywords
	boolean existsById(Integer id);
}
