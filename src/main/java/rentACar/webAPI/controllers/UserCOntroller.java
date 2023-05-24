package rentACar.webAPI.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rentACar.business.abstracts.UserService;
import rentACar.business.responses.GetAllUserResponse;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/users")
public class UserCOntroller {

    private UserService userService;

    @GetMapping()
    public ResponseEntity<List<GetAllUserResponse>> getAllUser() {
        return new ResponseEntity<>(userService.getAll(), HttpStatus.OK);
    }
}
