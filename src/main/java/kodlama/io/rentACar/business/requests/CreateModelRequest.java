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
public class CreateModelRequest {
	@NotNull(message = "Name alanı boş bırakılamaz")
	@NotBlank
	@Size(min = 3,max = 20,message = "Belirtilen Karakter Aralığında İsim Giriniz!!!")
	private String name;
	@NotNull
	@NotBlank
	private int brandId;

}
