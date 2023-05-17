package rentACar.business.rules;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import rentACar.core.utilities.exceptions.BusinessException;
import rentACar.dataAccess.abstracts.ModelRepository;

@Service
@AllArgsConstructor
public class ModelBusinessRules {
	private ModelRepository	modelRepository;

	public void checkIfModelNameExists(String name) {
		if (this.modelRepository.existsByName(name)) {
			throw new BusinessException("Model name already exists");// Java Exception types arasştır
		}
	}

	public void checkIfModelIdExists(int id) {
		if (!this.modelRepository.existsById(id)) {
			throw new BusinessException("Model id does not exists");
		}
	}
}