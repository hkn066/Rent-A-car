package rentACar.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdCarResponse {
    private String plate;
    private double dailyPrice;
    private String modelYear;
    private String modelName;
    private String brandName;
}
