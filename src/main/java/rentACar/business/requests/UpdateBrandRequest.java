package rentACar.business.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

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
