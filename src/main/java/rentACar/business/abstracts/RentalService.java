package rentACar.business.abstracts;

import rentACar.business.requests.RentalRequest;

public interface RentalService {

    void addRental(RentalRequest rentalRequest);
}
