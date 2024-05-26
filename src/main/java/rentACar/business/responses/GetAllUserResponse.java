package rentACar.business.responses;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllUserResponse {

	private int id;
	private String email;
	private String phoneNumber;
	private String firstName;
	private String lastName;
	private String companyTitle;
	
}
