package rentACar.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdCorporateUserResponse {
    private String companyTitle;
    private String email;
    private String phoneNumber;
}
