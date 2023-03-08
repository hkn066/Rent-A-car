package kodlama.io.rentACar.business.rules;

import org.springframework.stereotype.Service;

import kodlama.io.rentACar.core.utilities.exceptions.BusinessException;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BrandBusinessRules {
	private BrandRepository brandRepository;

	public void checkIfBrandExists(String name) {
		if (this.brandRepository.existsByName(name)) {
			throw new BusinessException("Brand name already exists");// Java Exception types
		}
	}

	public void checkIfBrandExists(int id) {
		if (!this.brandRepository.existsById(id)) {
			throw new BusinessException("Brand id does not exists");// Java Exception types
		}
	}
}