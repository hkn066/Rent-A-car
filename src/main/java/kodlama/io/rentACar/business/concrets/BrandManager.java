package kodlama.io.rentACar.business.concrets;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.requests.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.responses.GetByIdBrandResponse;
import kodlama.io.rentACar.business.rules.BrandBusinessRules;
import kodlama.io.rentACar.core.utilities.mappers.ModelMapperService;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.Brand;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BrandManager implements BrandService {
	private BrandRepository brandRepository;
	private ModelMapperService mapperService;
	private BrandBusinessRules brandBusinessRules;

	@Override
	public List<GetAllBrandsResponse> getAll() {
		List<Brand> brands = brandRepository.findAll();
		List<GetAllBrandsResponse> allBrandsResponses = brands.stream()
				.map(brand -> this.mapperService.forResponse().map(brand, GetAllBrandsResponse.class))
				.collect(Collectors.toList());
//		List<GetAllBrandsResponse> responses= new ArrayList<GetAllBrandsResponse>();
//		for(Brand brand : brands) {
//			GetAllBrandsResponse getAllBrandsResponse= new GetAllBrandsResponse();
//			getAllBrandsResponse.setId(brand.getId());
//			getAllBrandsResponse.setName(brand.getName());
//			responses.add(getAllBrandsResponse);
//		}

		return allBrandsResponses;
	}

	@Override
	public void add(CreateBrandRequest createBrandRequest) {
		// Brand brand= new Brand();
		// brand.setName(createBrandRequest.getName());;
		this.brandBusinessRules.checkIfBrandExists(createBrandRequest.getName());
		Brand brand = this.mapperService.forRequest().map(createBrandRequest, Brand.class);
		
		this.brandRepository.save(brand);

	}

	@Override
	public void update(UpdateBrandRequest updateBrandRequest,int id) {
		
		this.brandBusinessRules.checkIfBrandExists(id);		
		Brand brand=this.brandRepository.findById(id).orElseThrow();
		
		this.brandBusinessRules.checkIfBrandExists(updateBrandRequest.getName());
		brand= this.mapperService.forRequest().map(updateBrandRequest, Brand.class);
		brand.setId(id);
		
		this.brandRepository.save(brand);

	}

	@Override
	public void delete(int id) {
		this.brandRepository.deleteById(id);

	}

	@Override
	public GetByIdBrandResponse getById(int id) {

		Brand brand = this.brandRepository.findById(id).orElseThrow();

		GetByIdBrandResponse response = this.mapperService.forResponse().map(brand, GetByIdBrandResponse.class);

		return response;
	}

}
