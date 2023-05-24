package rentACar.business.concrets;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import rentACar.business.abstracts.IndividualUserService;
import rentACar.business.requests.CreateIndividualUserRequest;
import rentACar.business.requests.UpdateIndividualUserRequest;
import rentACar.business.responses.GetAllIndividualUserResponse;
import rentACar.business.responses.GetByIdIndividualUserResponse;
import rentACar.core.utilities.mappers.ModelMapperService;
import rentACar.dataAccess.abstracts.IndividualUserRepository;
import rentACar.entities.IndividualUser;

import java.util.List;

@Service
@AllArgsConstructor
public class IndividualUserManager implements IndividualUserService {
    private IndividualUserRepository individualUserRepository;
    private ModelMapperService mapperService;

    @Override
    public List<GetAllIndividualUserResponse> getALl() {
        List<IndividualUser> individualUsers = individualUserRepository.findAll();

        return individualUsers.stream().
                map(individualUser -> mapperService.forResponse().map(individualUser, GetAllIndividualUserResponse.class)).toList();

    }

    @Override
    public void add(CreateIndividualUserRequest individualUserRequest) {
        IndividualUser individualUser = mapperService.forRequest().map(individualUserRequest, IndividualUser.class);
        individualUserRepository.save(individualUser);

    }

    @Override
    public void delete(int id) {
        IndividualUser individualUser = individualUserRepository.findById(id).orElseThrow(RuntimeException::new);
        individualUserRepository.delete(individualUser);
    }

    @Override
    public void update(UpdateIndividualUserRequest individualUserRequest, int id) {
        individualUserRepository.findById(id).orElseThrow(RuntimeException::new);
        IndividualUser individualUser = mapperService.forRequest().map(individualUserRequest, IndividualUser.class);
        individualUser.setId(id);
        individualUserRepository.save(individualUser);
    }

    @Override
    public GetByIdIndividualUserResponse getById(int id) {
        IndividualUser individualUser = individualUserRepository.findById(id).orElseThrow(RuntimeException::new);
        return mapperService.forResponse().map(individualUser, GetByIdIndividualUserResponse.class);
    }


}
