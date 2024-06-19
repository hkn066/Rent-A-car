package rentACar.webAPI.controllers;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rentACar.business.abstracts.RentalService;
import rentACar.business.requests.RentalRequest;

@RestController
@RequestMapping("/api/rentals")
@AllArgsConstructor
public class RentalController {
    private final RentalService rentalService;

    @PostMapping()
    public ResponseEntity<Void> addRental(@RequestBody @Valid RentalRequest rentalRequest){
        rentalService.addRental(rentalRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
