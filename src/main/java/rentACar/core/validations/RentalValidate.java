package rentACar.core.validations;

import java.time.LocalDate;



public class RentalValidate implements RentalValidateServis {

	@Override
	public void checkRentalDate(LocalDate rantDate) {
		LocalDate date=LocalDate.now();
		if(rantDate.isBefore(date)) {
			
		}
		
	}

}
