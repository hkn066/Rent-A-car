package rentACar.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateModelRequest {

    @NotNull(message = "Name alanı boş bırakılamaz")
    @NotBlank
    @Size(min = 3, max = 20, message = "Belirtilen Karakter Aralığında İsim Giriniz!!!")
    private String name;

    @NotNull
    private int brandId;

}
