package rentACar.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAllIndividualUserResponse {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

}