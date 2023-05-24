package rentACar.business.abstracts;

import rentACar.business.requests.CreateCorporateUserRequest;
import rentACar.business.requests.CreateIndividualUserRequest;
import rentACar.business.requests.UpdateCorporateUserRequest;
import rentACar.business.requests.UpdateIndividualUserRequest;
import rentACar.business.responses.GetAllCorporateUserResponse;
import rentACar.business.responses.GetAllIndividualUserResponse;
import rentACar.business.responses.GetByIdCorporateUserResponse;
import rentACar.business.responses.GetByIdIndividualUserResponse;

import java.util.List;

public interface CorporateUserService {
    List<GetAllCorporateUserResponse> getALl();

    void add(CreateCorporateUserRequest corporateUserRequest);

    void delete(int id);

    void update(UpdateCorporateUserRequest updateCorporateRequest, int id);

    GetByIdCorporateUserResponse getById(int id);
}
