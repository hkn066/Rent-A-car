package rentACar.business.concrets;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import rentACar.business.abstracts.ModelService;
import rentACar.business.requests.CreateModelRequest;
import rentACar.business.requests.UpdateModelRequest;
import rentACar.business.responses.GetAllModelsResponse;
import rentACar.business.responses.GetByIdModelResponse;
import rentACar.business.rules.ModelBusinessRules;
import rentACar.core.utilities.mappers.ModelMapperService;
import rentACar.dataAccess.abstracts.ModelRepository;
import rentACar.entities.Model;

import java.util.List;

@Service
@AllArgsConstructor
public class ModelManager implements ModelService {
    private ModelRepository modelRepository;
    private ModelMapperService mapperService;
    private ModelBusinessRules businessRules;


    @Override
    public List<GetAllModelsResponse> getAll() {
        List<Model> models = modelRepository.findAll();

        return models.stream()
                .map(model -> this.mapperService.forResponse().map(model, GetAllModelsResponse.class)).toList();
    }


    @Override
    public void add(CreateModelRequest createModelRequest) {
        businessRules.checkIfModelNameExists(createModelRequest.getName());
        Model model = this.mapperService.forRequest().map(createModelRequest, Model.class);
        this.modelRepository.save(model);

    }

    @Override
    public void update(UpdateModelRequest updateModelRequest, int id) {
        this.businessRules.checkIfModelIdExists(id);
        this.businessRules.checkIfModelNameExists(updateModelRequest.getName());
        Model model = this.mapperService.forRequest().map(updateModelRequest, Model.class);
        model.setId(id);
        this.modelRepository.save(model);

    }

    @Override
    public void delete(int id) {
        this.businessRules.checkIfModelIdExists(id);
        this.modelRepository.deleteById(id);

    }

    @Override
    public GetByIdModelResponse getById(int id) {
        Model model = this.modelRepository.findById(id).orElseThrow();
        return this.mapperService.forResponse().map(model, GetByIdModelResponse.class);
    }

}
