package rentACar.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCarRequest {
    @NotNull(message = "Plaka Alanı Boş Olamaz.")
    @NotBlank
    String plate;
    @NotNull(message = "Model Yılı Boş Olamaz")
    @NotBlank
    int modelYear;
//    @NotNull(message = "Model İsmi Boş Olamaz")
//    @NotBlank
    String modelName;

    String brandName;
    @NotNull()
    @NotBlank()
    double dailyPrice;


}
