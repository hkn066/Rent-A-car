package kodlama.io.rentACar.business.concrets;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracts.ModelService;
import kodlama.io.rentACar.business.requests.CreateModelRequest;
import kodlama.io.rentACar.business.responses.GetAllModelsResponse;
import kodlama.io.rentACar.core.utilities.mappers.ModelMapperService;
import kodlama.io.rentACar.dataAccess.abstracts.ModelRepository;
import kodlama.io.rentACar.entities.Model;
import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class ModelManager implements ModelService {
	private ModelRepository modelRepository;
	private ModelMapperService mapperService;
	

	@Override
	public List<GetAllModelsResponse> getAll() {
		List<Model> models= modelRepository.findAll();
		
		List<GetAllModelsResponse> modelsResponses =models.stream()
				.map(model->this.mapperService.forResponse().map(model, GetAllModelsResponse.class)).toList();
					//bu alan modelmapperın map alanı verilen classı map ile verileri çevirme işlemini yapar.
		return modelsResponses;
	}


	@Override
	public void add(CreateModelRequest createModelRequest) {
		Model model= this.mapperService.forRequest().map(createModelRequest, Model.class);
		this.modelRepository.save(model);
		
	}

}
