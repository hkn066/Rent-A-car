package rentACar.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateModelRequest {
    @NotNull
    @NotBlank
    @Size(min = 4 ,max = 20 ,message = "Model name must have a min. of 4 and a max of 20 characters")
    private String name;
    @NotBlank
    @NotNull
    private String brantName;
}
