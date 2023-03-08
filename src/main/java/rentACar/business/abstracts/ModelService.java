package rentACar.business.abstracts;

import java.util.List;

import rentACar.business.requests.CreateModelRequest;
import rentACar.business.responses.GetAllModelsResponse;

public interface ModelService {
	List<GetAllModelsResponse> getAll();
	void add(CreateModelRequest createModelRequest); 
}
