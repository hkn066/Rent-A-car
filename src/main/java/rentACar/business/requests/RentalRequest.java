package rentACar.business.requests;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import org.springframework.lang.Nullable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RentalRequest {
    @NotNull
    @NotBlank
    private LocalDate rentDate;
    @Nullable
    private LocalDate returnDate;
    @NotNull
    @NotBlank
    private int carId;
    @NotNull
    @NotBlank
    private int userId;

}
