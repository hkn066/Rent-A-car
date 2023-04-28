package rentACar.business.abstracts;

import rentACar.business.requests.CreateCarRequest;
import rentACar.business.requests.UpdateCarRequest;
import rentACar.business.responses.GetAllCarResponse;
import rentACar.business.responses.GetByIdCarResponse;

import java.util.List;

public interface CarService {

    List<GetAllCarResponse> getALl();
    void add(CreateCarRequest createCarRequest);
    void delete(int id);
    void update(UpdateCarRequest updateCarRequest,int id);
    GetByIdCarResponse getById(int id);
}
