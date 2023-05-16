package rentACar.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdCarResponse {
    String plate;
    double dailyPrice;
    String modelYear;
    String modelName;
    String brandName;
}
