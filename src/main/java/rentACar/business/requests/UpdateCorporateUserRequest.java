package rentACar.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

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
