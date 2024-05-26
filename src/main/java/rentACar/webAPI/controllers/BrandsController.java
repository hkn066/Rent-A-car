package rentACar.webAPI.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rentACar.business.abstracts.BrandService;
import rentACar.business.requests.CreateBrandRequest;
import rentACar.business.requests.UpdateBrandRequest;
import rentACar.business.responses.GetAllBrandsResponse;
import rentACar.business.responses.GetByIdBrandResponse;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/brands")
@AllArgsConstructor
public class BrandsController {
    private BrandService brandService;


    @GetMapping()
    public List<GetAllBrandsResponse> getAll() {
        return brandService.getAll();
    }

    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody() @Valid() CreateBrandRequest createBrandRequest) {
        this.brandService.add(createBrandRequest);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GetByIdBrandResponse> getById(@PathVariable int id) {
        return new ResponseEntity<>(brandService.getById(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Valid() UpdateBrandRequest updateBrandRequest, @PathVariable @Valid int id) {
        this.brandService.update(updateBrandRequest, id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        this.brandService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}