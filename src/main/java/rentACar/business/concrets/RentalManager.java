package rentACar.business.concrets;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import rentACar.business.abstracts.RentalService;
import rentACar.business.requests.RentalRequest;
import rentACar.core.utilities.mappers.ModelMapperService;
import rentACar.core.validations.RentalValidateServis;
import rentACar.dataAccess.abstracts.RentalRepository;
import rentACar.entities.Rental;

@Service
@AllArgsConstructor
public class RentalManager implements RentalService {
    private RentalRepository rentalRepository;
    private ModelMapperService mapperService;
    private RentalValidateServis rentalValidateServis;
    
    
    @Override
    public void addRental(RentalRequest rentalRequest) {
    	rentalValidateServis.checkRentalDate(rentalRequest.getRentDate());
        Rental rental= mapperService.forRequest().map(rentalRequest, Rental.class);
        rentalRepository.save(rental);
    }
}
