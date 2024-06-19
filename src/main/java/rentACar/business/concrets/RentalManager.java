package rentACar.business.concrets;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import rentACar.business.abstracts.RentalService;
import rentACar.business.requests.RentalRequest;
import rentACar.core.utilities.mappers.ModelMapperService;
import rentACar.core.validations.RentalValidateServis;
import rentACar.dataAccess.abstracts.CarRepository;
import rentACar.dataAccess.abstracts.RentalRepository;
import rentACar.entities.Car;
import rentACar.entities.Rental;
import rentACar.entities.enumeration.CarStateEnum;

@Service
@AllArgsConstructor
public class RentalManager implements RentalService {
    private final RentalRepository rentalRepository;
    private final ModelMapperService mapperService;
    private final CarRepository carRepository;
    private final RentalValidateServis rentalValidateServis;


    @Override
    public void addRental(RentalRequest rentalRequest) {
        rentalValidateServis.checkRentalDate(rentalRequest.getRentDate());
        Car car = carRepository.findById(rentalRequest.getCarId()).orElseThrow();
        rentalValidateServis.isCarAvailable(car.getState().getDesc());
        Rental rental = mapperService.forRequest().map(rentalRequest, Rental.class);
        rental.setRentDate(rentalValidateServis.getDateFormat(rentalRequest.getRentDate()));
        rental.setRentDate(rentalValidateServis.getDateFormat(rentalRequest.getReturnDate()));
        rental.setCar(car);
        rental.getCar().setState(CarStateEnum.RENTED);
        rentalRepository.saveAndFlush(rental);

    }
}
