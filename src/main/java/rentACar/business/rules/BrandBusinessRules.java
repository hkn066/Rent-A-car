package rentACar.business.rules;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import rentACar.core.utilities.exceptions.BusinessException;
import rentACar.dataAccess.abstracts.BrandRepository;

@Service
@AllArgsConstructor
public class BrandBusinessRules {
	private BrandRepository brandRepository;

	public void checkIfBrandNameExists(String name) {
		if (this.brandRepository.existsByName(name)) {
			throw new BusinessException("Brand name already exists");// Java Exception types arasştır
		}
	}

	public void checkIfBrandIdExists(int id) {
		if (!this.brandRepository.existsById(id)) {
			throw new BusinessException("Brand id does not exists");
		}
	}
}