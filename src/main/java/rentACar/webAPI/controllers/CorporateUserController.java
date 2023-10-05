package rentACar.webAPI.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import rentACar.business.abstracts.CorporateUserService;
import rentACar.business.requests.CreateCorporateUserRequest;
import rentACar.business.requests.UpdateCorporateUserRequest;
import rentACar.business.responses.GetAllCorporateUserResponse;
import rentACar.business.responses.GetByIdCorporateUserResponse;

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
