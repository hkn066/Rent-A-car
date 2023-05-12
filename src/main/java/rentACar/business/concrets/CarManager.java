package rentACar.business.concrets;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import rentACar.business.abstracts.CarService;
import rentACar.business.requests.CreateCarRequest;
import rentACar.business.requests.UpdateCarRequest;
import rentACar.business.responses.GetAllCarResponse;
import rentACar.business.responses.GetByIdCarResponse;
import rentACar.business.rules.CarBusinessRules;
import rentACar.core.utilities.mappers.ModelMapperService;
import rentACar.dataAccess.abstracts.CarRepository;
import rentACar.entities.Car;

import java.util.List;
@Service
@AllArgsConstructor
public class CarManager implements CarService {
    private CarRepository carRepository;
    private ModelMapperService modelMapperService;
    private CarBusinessRules carBusinessRules;
    @Override
    public List<GetAllCarResponse> getALl() {
        List<Car> cars= carRepository.findAll();
        List<GetAllCarResponse> getAllCarResponses=cars.stream().map(car -> modelMapperService.forResponse().map(car,GetAllCarResponse.class)).toList();

        return getAllCarResponses;
    }

    @Override
    public void add(CreateCarRequest createCarRequest) {
        this.carBusinessRules.checkIfCarPlae(createCarRequest.getPlate());
        Car car=modelMapperService.forRequest().map(createCarRequest,Car.class);
        this.carRepository.save(car);
    }

    @Override
    public void delete(int id) {
        carBusinessRules.checkIfCarId(id);
        carRepository.deleteById(id);
    }

    @Override
    public void update(UpdateCarRequest updateCarRequest, int id) {
        carBusinessRules.checkIfCarId(id);
        Car car=modelMapperService.forRequest().map(updateCarRequest,Car.class);
        car.setId(id);
        carRepository.save(car);
    }

    @Override
    public GetByIdCarResponse getById(int id) {
        
        return null;
    }
}
