package rentACar.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateCarRequest {
    @NotBlank
    @NotNull
    @Size(min = 5,max = 9)
    private String plate;
    @NotBlank
    @NotNull
    private double dailyPrice;
    @NotBlank
    @NotNull
    private int modelYear;
    @NotBlank
    @NotNull
    private int state;
}
