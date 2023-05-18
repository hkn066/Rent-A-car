package rentACar.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCarResponse {
    private String packageName;

    private String plate;
    private double dailyPrice;
    private int modelYear;

    private int state;
    private String modelName;
    private String brandName;
}
