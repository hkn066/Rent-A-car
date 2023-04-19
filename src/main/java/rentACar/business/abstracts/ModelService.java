package rentACar.business.abstracts;

import rentACar.business.requests.CreateModelRequest;
import rentACar.business.requests.UpdateModelRequest;
import rentACar.business.responses.GetAllModelsResponse;
import rentACar.business.responses.GetByIdModelResponse;

import java.util.List;

public interface ModelService {
    List<GetAllModelsResponse> getAll();

    void add(CreateModelRequest createModelRequest);

    void update(UpdateModelRequest updateModelRequest, int id);

    void delete(int id);

    GetByIdModelResponse getById(int id);
}
