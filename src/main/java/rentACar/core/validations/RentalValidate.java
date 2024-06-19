package rentACar.core.validations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import rentACar.core.utilities.exceptions.BusinessException;
import rentACar.entities.enumeration.CarStateEnum;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;


@Service
@AllArgsConstructor
public class RentalValidate implements RentalValidateServis {

	@Override
	public void checkRentalDate(LocalDate rantDate) {
		LocalDate date=LocalDate.now();
		if(rantDate.isBefore(date)) {
			throw new BusinessException("Kiralama tarihini ileri bir tarih seçiniz...");
		}
		
	}
	@Override
	public String getDateFormat(LocalDate localDate) {
		DateTimeFormatter timeFormatter=DateTimeFormatter.ofPattern("dd/MM/YYYY");
		return timeFormatter.format(localDate);
	}

	@Override
	public boolean isCarAvailable(String carState){
		if (!Objects.equals(carState,CarStateEnum.AVAILABLE.getDesc())){
			throw new BusinessException("Car rental is Failed.Because this car is "+CarStateEnum.getByDescToValue(carState));
		}
		return true;
	}

}
