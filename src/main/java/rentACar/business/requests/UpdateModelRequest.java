package rentACar.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
