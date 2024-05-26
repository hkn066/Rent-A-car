package rentACar.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCarRequest {
	@NotNull(message = "Name alanı boş bırakılamaz")
	@NotBlank
	@Size(min = 3, max = 20, message = "Belirtilen karakter aralığında değer giriniz!!!")
	private String packageName;
	@NotNull(message = "Plaka Alanı Boş Olamaz.")
	@NotBlank
	private String plate;
	
	@NotNull(message = "Model Yılı Boş Olamaz")
	private int modelYear;
	
	@NotNull(message = "Model İsmi Boş Olamaz")
	private Integer modelId;

	@NotNull()
	private double dailyPrice;

}
