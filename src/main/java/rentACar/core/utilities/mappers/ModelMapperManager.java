package rentACar.core.utilities.mappers;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ModelMapperManager implements ModelMapperService {
	
	private ModelMapper modelMapper;

	@Override
	public ModelMapper forResponse() {
		this.modelMapper.getConfiguration()
		.setAmbiguityIgnored(true)
		.setMatchingStrategy(MatchingStrategies.LOOSE);//gevşek bağlılık için eksik gelen alanları map etme ne geliyorsa onu map et
		return this.modelMapper;
	}

	@Override
	public ModelMapper forRequest() {
		this.modelMapper.getConfiguration()
		.setAmbiguityIgnored(true)//olmayan verileri veya belirsizlik durumlarında o alanı ignore etmek için
		.setMatchingStrategy(MatchingStrategies.STANDARD);
		return this.modelMapper;
	}

}
