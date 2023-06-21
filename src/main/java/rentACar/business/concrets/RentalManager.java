package rentACar.business.concrets;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import rentACar.business.abstracts.RentalService;
import rentACar.business.requests.RentalRequest;
import rentACar.core.utilities.mappers.ModelMapperService;
import rentACar.dataAccess.abstracts.RentalRepository;
import rentACar.entities.Rental;

@Service
@AllArgsConstructor
public class RentalManager implements RentalService {
    private RentalRepository rentalRepository;
    private ModelMapperService mapperService;
    @Override
    public void addRental(RentalRequest rentalRequest) {
        Rental rental= mapperService.forRequest().map(rentalRequest, Rental.class);
        rentalRepository.save(rental);
    }
}
