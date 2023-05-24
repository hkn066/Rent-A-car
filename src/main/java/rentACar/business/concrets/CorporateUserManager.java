package rentACar.business.concrets;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import rentACar.business.abstracts.CorporateUserService;
import rentACar.business.requests.CreateCorporateUserRequest;
import rentACar.business.requests.UpdateCorporateUserRequest;
import rentACar.business.responses.GetAllCorporateUserResponse;
import rentACar.business.responses.GetByIdCorporateUserResponse;
import rentACar.core.utilities.mappers.ModelMapperService;
import rentACar.dataAccess.abstracts.CorporateUserRepository;
import rentACar.entities.CorporateUser;
import java.util.List;


@Service
@AllArgsConstructor
public class CorporateUserManager implements CorporateUserService {
    private CorporateUserRepository corporateUserRepository;
    private ModelMapperService mapperService;

    @Override
    public List<GetAllCorporateUserResponse> getALl() {
        List<CorporateUser> corporateUsers = corporateUserRepository.findAll();

        return corporateUsers.stream().
                map(corporateUser -> mapperService.forResponse().map(corporateUser, GetAllCorporateUserResponse.class)).toList();

    }

    @Override
    public void add(CreateCorporateUserRequest corporateUserRequest) {
        CorporateUser corporateUser = mapperService.forRequest().map(corporateUserRequest, CorporateUser.class);
        corporateUserRepository.save(corporateUser);

    }

    @Override
    public void delete(int id) {
        CorporateUser corporateUser = corporateUserRepository.findById(id).orElseThrow(RuntimeException::new);
        corporateUserRepository.delete(corporateUser);
    }

    @Override
    public void update(UpdateCorporateUserRequest corporateUserRequest, int id) {
        corporateUserRepository.findById(id).orElseThrow(RuntimeException::new);
        CorporateUser corporateUser = mapperService.forRequest().map(corporateUserRequest, CorporateUser.class);
        corporateUser.setId(id);
        corporateUserRepository.save(corporateUser);
    }

    @Override
    public GetByIdCorporateUserResponse getById(int id) {
        CorporateUser corporateUser = corporateUserRepository.findById(id).orElseThrow(RuntimeException::new);
        return mapperService.forResponse().map(corporateUser, GetByIdCorporateUserResponse.class);
    }

}
