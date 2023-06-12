package rentACar.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCorporateUserRequest {
    @NotNull(message = "Soyisim Alanı Boş bırakılamaz")
    @NotBlank
    private String companyName;
    @NotNull(message = "Email Alanı Boş bırakılamaz")
    @NotBlank
    @Email
    private String email;
    @NotNull(message = "Password Alanı Boş bırakılamaz")
    @NotBlank
    private String password;
    @NotNull(message = "Telefon Alanı Boş bırakılamaz")
    @NotBlank
    @Size(max = 11)
    private String phoneNumber;

}
