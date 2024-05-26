package rentACar.webAPI.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rentACar.business.abstracts.IndividualUserService;
import rentACar.business.requests.CreateIndividualUserRequest;
import rentACar.business.requests.UpdateIndividualUserRequest;
import rentACar.business.responses.GetAllIndividualUserResponse;
import rentACar.business.responses.GetByIdIndividualUserResponse;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/individualUser")
public class IndividualUserController {
    private IndividualUserService individualUserService;

    @GetMapping()
    public List<GetAllIndividualUserResponse> getAll() {
        return individualUserService.getALl();
    }

    @GetMapping("/{id}")
    public GetByIdIndividualUserResponse getByIdIndividualUser(@PathVariable int id) {
        return individualUserService.getById(id);
    }

    @PostMapping()
    public ResponseEntity<Void> createIndividualUser(@RequestBody @Valid() CreateIndividualUserRequest individualUserRequest) {
        individualUserService.add(individualUserRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateIndividualUser(@RequestBody UpdateIndividualUserRequest individualUserRequest, @PathVariable int id) {
        individualUserService.update(individualUserRequest, id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteIndividualUser(@PathVariable int id) {
        individualUserService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
