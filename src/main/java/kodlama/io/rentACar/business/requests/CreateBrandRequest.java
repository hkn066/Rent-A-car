package kodlama.io.rentACar.business.requests;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
