package rentACar.business.concrets;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import rentACar.business.abstracts.UserService;
import rentACar.business.responses.GetAllUserResponse;
import rentACar.core.utilities.mappers.ModelMapperService;
import rentACar.dataAccess.abstracts.UserRepository;
import rentACar.entities.User;

import java.util.List;


@Service
@AllArgsConstructor
public class UserManager implements UserService {
    private UserRepository userRepository;
    private ModelMapperService mapperService;

    @Override
    public List<GetAllUserResponse> getAll() {
        List<User> users= userRepository.findAll();
        return users.stream().map(userResponse->mapperService.forResponse().map(userResponse,GetAllUserResponse.class)).toList();
    }
}
