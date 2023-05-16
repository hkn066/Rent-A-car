package rentACar.business.rules;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import rentACar.core.utilities.exceptions.BusinessException;
import rentACar.dataAccess.abstracts.CarRepository;

@Service
@AllArgsConstructor
public class CarBusinessRules {

    private CarRepository carRepository;
    public void checkIfCarPlae(String plate) {
        if (carRepository.existsByPlate(plate)){
            throw new  BusinessException("Already registered with this license plate");
        }

    }

    public void checkIfCarId(int id){
        if (!carRepository.existsById(id)){
            throw new BusinessException("This record does not exist");
        }
    }
}
