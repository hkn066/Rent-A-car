package rentACar.business.concrets;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import rentACar.business.abstracts.ModelService;
import rentACar.business.requests.CreateModelRequest;
import rentACar.business.responses.GetAllModelsResponse;
import rentACar.core.utilities.mappers.ModelMapperService;
import rentACar.dataAccess.abstracts.ModelRepository;
import rentACar.entities.Model;
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
