package rentACar.core.validations;

import java.time.LocalDate;

public interface RentalValidateServis {

	void checkRentalDate(LocalDate rantDate);

	String getDateFormat(LocalDate localDate);

	boolean isCarAvailable(String carState);
}
