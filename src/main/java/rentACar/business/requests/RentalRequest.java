package rentACar.business.requests;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RentalRequest {
    @NotNull
    private LocalDate rentDate;
    @Nullable
    private LocalDate returnDate;
    @NotNull
    private int carId;
    @NotNull
    private int userId;
}
