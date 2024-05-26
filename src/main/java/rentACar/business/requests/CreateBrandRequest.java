package rentACar.business.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateBrandRequest {
	@NotNull(message = "Name alanı boş bırakılamaz")
	@NotBlank
	@Size(min = 3,max = 20,message = "Belirtilen karakter aralığında değer giriniz!!!")
	private String name;
}
