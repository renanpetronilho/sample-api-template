package io.fylabs.sampleapi.usecase.sample;

import io.fylabs.sampleapi.repository.SampleRepository;
import io.fylabs.sampleapi.dto.CreateSampleDTO;
import io.fylabs.sampleapi.dto.SampleDTO;
import io.fylabs.sampleapi.entity.SampleEntity;
import io.fylabs.sampleapi.mapper.SampleMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Slf4j
@Service
@RequiredArgsConstructor
public class CreateSampleUseCase {

    private final SampleRepository sampleRepository;

    public SampleDTO create(CreateSampleDTO createSampleDTO){
        log.info("[m=create] Create Sample {}", createSampleDTO);

        SampleEntity sampleEntity = SampleMapper.toSample(createSampleDTO);
        sampleEntity.setCreatedAt(LocalDateTime.now());

        return SampleMapper.fromSample(
                        sampleRepository.save(sampleEntity));

    }
}
