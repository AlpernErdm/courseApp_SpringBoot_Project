package kodlama.io.ders.business.core.utilities.mapper;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ModelMapperManager implements ModelMapperService{
    private ModelMapper modelMapper;
    @Override
    public ModelMapper forRequest() {
        this.modelMapper.getConfiguration()
                .setAmbiguityIgnored(true)//belirsizlik anında ıgnore etme fonksiyonu
                .setMatchingStrategy(MatchingStrategies.LOOSE);//gevşek mapleme yap yani 4 entityden 2 si de alınsa da olabilir
        return this.modelMapper;
    }

    @Override
    public ModelMapper forResponse() {
        this.modelMapper.getConfiguration()
                .setAmbiguityIgnored(true)//belirsizlik anında ıgnore etme fonksiyonu
                .setMatchingStrategy(MatchingStrategies.STANDARD);//gevşek mapleme yap yani 4 entityden 2 si de alınsa da olabilir
        return this.modelMapper;
    }
}
