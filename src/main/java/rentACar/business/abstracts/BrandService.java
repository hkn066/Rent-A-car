package rentACar.business.abstracts;

import java.util.List;

import rentACar.business.requests.CreateBrandRequest;
import rentACar.business.requests.UpdateBrandRequest;
import rentACar.business.responses.GetAllBrandsResponse;
import rentACar.business.responses.GetByIdBrandResponse;

public interface BrandService {
	List<GetAllBrandsResponse> getAll();
	void add(CreateBrandRequest createBrandRequest);
	void update(UpdateBrandRequest updateBrandRequest,int id);
	void delete(int id);
	GetByIdBrandResponse getById(int id);
	
}
