package rentACar.webAPI.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rentACar.business.abstracts.CorporateUserService;
import rentACar.business.abstracts.IndividualUserService;
import rentACar.business.requests.CreateCorporateUserRequest;
import rentACar.business.requests.CreateIndividualUserRequest;
import rentACar.business.requests.UpdateCorporateUserRequest;
import rentACar.business.requests.UpdateIndividualUserRequest;
import rentACar.business.responses.GetAllCorporateUserResponse;
import rentACar.business.responses.GetAllIndividualUserResponse;
import rentACar.business.responses.GetByIdCorporateUserResponse;
import rentACar.business.responses.GetByIdIndividualUserResponse;

import javax.validation.Valid;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/corporateUser")
public class CorporateUserController{

    private CorporateUserService corporateUserService;

    @GetMapping()
    public List<GetAllCorporateUserResponse> getAll() {
        return corporateUserService.getALl();
    }

    @GetMapping("/{id}")
    public GetByIdCorporateUserResponse getByIdCorporateUser(@PathVariable int id) {
        return corporateUserService.getById(id);
    }

    @PostMapping()
    public ResponseEntity<Void> createCorporateUser(@RequestBody @Valid() CreateCorporateUserRequest corporateUserRequest) {
        corporateUserService.add(corporateUserRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateCorporateUser(@RequestBody UpdateCorporateUserRequest corporateUserRequest, @PathVariable int id) {
        corporateUserService.update(corporateUserRequest, id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCorporateUser(@PathVariable int id) {
        corporateUserService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
