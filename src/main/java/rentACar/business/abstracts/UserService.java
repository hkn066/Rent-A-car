package rentACar.business.abstracts;

import java.util.List;

import rentACar.business.responses.GetAllUserResponse;

public interface UserService {
    List<GetAllUserResponse> getAll();
}
