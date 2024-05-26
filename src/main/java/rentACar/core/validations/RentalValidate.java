package rentACar.core.validations;

import java.time.LocalDate;


import jakarta.validation.ValidationException;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;



@Service
@AllArgsConstructor
public class RentalValidate implements RentalValidateServis {

	@Override
	public void checkRentalDate(LocalDate rantDate) {
		LocalDate date=LocalDate.now();
		if(rantDate.isBefore(date)) {
			throw new ValidationException("Kiralama tarihi ileri bir tarih seçiniz...");
		}
		
	}

}
