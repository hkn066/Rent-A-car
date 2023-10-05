package rentACar.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllUserResponse {
    private int id;
    private String userType;
    private String email;
    private String phoneNumber;
    private String companyTitle;
    private String firstName;
    private String lastName;

//    public GetAllUserResponse(int id, String email, String phoneNumber, String firstName, String lastName) {
//        this.id = id;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }
//
//    public GetAllUserResponse(int id, String email, String phoneNumber, String companyName) {
//        this.id = id;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
//        this.companyName = companyName;
//    }
}

