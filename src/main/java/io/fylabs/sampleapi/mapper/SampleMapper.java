package io.fylabs.sampleapi.mapper;

import io.fylabs.sampleapi.dto.CreateSampleDTO;
import io.fylabs.sampleapi.dto.SampleDTO;
import io.fylabs.sampleapi.entity.SampleEntity;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

public abstract class SampleMapper {

    public SampleMapper(){}


    private static final ModelMapper mapper = new ModelMapper();

    static {
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
    }

    public static SampleEntity toSample(CreateSampleDTO createSampleDTO) {
         return mapper.map(createSampleDTO, SampleEntity.class);
    }

    public static SampleDTO fromSample(SampleEntity sampleEntity){
        return mapper.map(sampleEntity, SampleDTO.class);
    }
}
