package io.fylabs.sampleapi.usecase.sample;

import io.fylabs.sampleapi.exception.SampleNotFoundException;
import io.fylabs.sampleapi.repository.SampleRepository;
import io.fylabs.sampleapi.dto.SampleDTO;
import io.fylabs.sampleapi.entity.SampleEntity;
import io.fylabs.sampleapi.mapper.SampleMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class FindSampleUseCase {

    private final SampleRepository sampleRepository;

    public SampleDTO findById(String sampleId){
        final SampleEntity sampleEntity = this.sampleRepository
                .findById(sampleId)
                .orElseThrow(() -> new SampleNotFoundException());
        return SampleMapper.fromSample(sampleEntity);
    }
}
