package rentACar.business.abstracts;

import java.util.List;

import rentACar.business.requests.CreateCorporateUserRequest;
import rentACar.business.requests.UpdateCorporateUserRequest;
import rentACar.business.responses.GetAllCorporateUserResponse;
import rentACar.business.responses.GetByIdCorporateUserResponse;

public interface CorporateUserService {
    List<GetAllCorporateUserResponse> getALl();

    void add(CreateCorporateUserRequest corporateUserRequest);

    void delete(int id);

    void update(UpdateCorporateUserRequest updateCorporateRequest, int id);

    GetByIdCorporateUserResponse getById(int id);
}
