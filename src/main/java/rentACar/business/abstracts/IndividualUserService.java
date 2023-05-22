package rentACar.business.abstracts;


import rentACar.business.requests.CreateIndividualUserRequest;
import rentACar.business.requests.UpdateCarRequest;
import rentACar.business.requests.UpdateIndividualUserRequest;
import rentACar.business.responses.GetAllIndividualUserResponse;
import rentACar.business.responses.GetByIdCarResponse;
import rentACar.business.responses.GetByIdIndividualUserResponse;

import java.util.List;

public interface IndividualUserService {
    List<GetAllIndividualUserResponse> getALl();
    void add(CreateIndividualUserRequest individualUserRequest);
    void delete(int id);
    void update(UpdateIndividualUserRequest updateCarRequest, int id);
    GetByIdIndividualUserResponse getById(int id);
}
