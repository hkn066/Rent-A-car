package rentACar.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RentalRequest {
    @NotNull
    @NotBlank
    private LocalDateTime rentDate;
    @Nullable
    private LocalDateTime returnDate;
    @NotNull
    @NotBlank
    private int carId;
    @NotNull
    @NotBlank
    private int userId;

}
