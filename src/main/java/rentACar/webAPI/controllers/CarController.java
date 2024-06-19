package rentACar.webAPI.controllers;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rentACar.business.abstracts.CarService;
import rentACar.business.requests.CreateCarRequest;
import rentACar.business.requests.UpdateCarRequest;
import rentACar.business.responses.GetAllCarResponse;
import rentACar.business.responses.GetByIdCarResponse;


import java.util.List;


@RestController
@RequestMapping("/api/cars")
@AllArgsConstructor
public class CarController {
    private CarService carService;

    @GetMapping()
    public List<GetAllCarResponse> getAll() {
        return carService.getALl();

    }

    @PostMapping()
    public ResponseEntity<Void> createCar(@RequestBody @Valid() CreateCarRequest createCarRequest) {
        carService.add(createCarRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateCar(@RequestBody @Valid() UpdateCarRequest updateCarRequest, @PathVariable int id) {
        carService.update(updateCarRequest, id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCreate(@PathVariable int id) {
        carService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GetByIdCarResponse> getByIdCar(@PathVariable  int id) {

        return new ResponseEntity<>(carService.getById(id), HttpStatus.OK);
    }

}
