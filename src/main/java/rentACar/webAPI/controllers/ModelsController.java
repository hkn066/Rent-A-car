package rentACar.webAPI.controllers;

import java.util.List;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.AllArgsConstructor;
import rentACar.business.abstracts.ModelService;
import rentACar.business.requests.CreateModelRequest;
import rentACar.business.requests.UpdateModelRequest;
import rentACar.business.responses.GetAllModelsResponse;
import rentACar.business.responses.GetByIdModelResponse;
import rentACar.entities.Model;

@RestController
@RequestMapping("/api/models")
@AllArgsConstructor
public class ModelsController {
	private ModelService modelService;

	@GetMapping()
	public ResponseEntity< List<GetAllModelsResponse>> getAll() {
		return new ResponseEntity<>(modelService.getAll(),HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<GetByIdModelResponse> getByIdModel(@PathVariable int id){
		return new ResponseEntity<>(modelService.getById(id),HttpStatus.OK);
	}

	@PostMapping()
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(@RequestBody() @Valid() CreateModelRequest createModelRequest) {
		modelService.add(createModelRequest);
	}

	@PutMapping("/{id}")
	public void updateModel(@RequestBody UpdateModelRequest modelRequest , @PathVariable int id){
		modelService.update(modelRequest,id);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id){
		modelService.delete(id);
	}





}
