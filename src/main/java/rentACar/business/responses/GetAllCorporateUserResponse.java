package rentACar.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCorporateUserResponse {
    private int id;
    private String companyTitle;
    private String email;
    private String phoneNumber;

}
