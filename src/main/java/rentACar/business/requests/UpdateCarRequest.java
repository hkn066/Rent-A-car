package rentACar.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

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
