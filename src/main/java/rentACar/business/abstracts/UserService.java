package rentACar.business.abstracts;

import rentACar.business.responses.GetAllModelsResponse;
import rentACar.business.responses.GetAllUserResponse;

import java.util.List;

public interface UserService {
    List<GetAllUserResponse> getAll();
}
