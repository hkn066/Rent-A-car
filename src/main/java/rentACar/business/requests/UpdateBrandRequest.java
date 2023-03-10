package rentACar.business.requests;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateBrandRequest {
	@NotBlank
	@NotNull
	private int id;
	@NotBlank
	@NotNull(message = "Name alanı boş bırakılamaz")
	private String name;
}
