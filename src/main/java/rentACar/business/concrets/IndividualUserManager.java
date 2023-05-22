package rentACar.business.concrets;

import rentACar.business.abstracts.IndividualUserService;
import rentACar.business.requests.CreateIndividualUserRequest;
import rentACar.business.requests.UpdateIndividualUserRequest;
import rentACar.business.responses.GetAllIndividualUserResponse;
import rentACar.business.responses.GetByIdCarResponse;
import rentACar.business.responses.GetByIdIndividualUserResponse;

import java.util.List;

public class IndividualUserManager  implements IndividualUserService {
    @Override
    public List<GetAllIndividualUserResponse> getALl() {
        return null;
    }

    @Override
    public void add(CreateIndividualUserRequest individualUserRequest) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(UpdateIndividualUserRequest updateCarRequest, int id) {

    }

    @Override
    public GetByIdIndividualUserResponse getById(int id) {
        return null;
    }


}
