package io.fylabs.sampleapi.api.impl;

import io.fylabs.sampleapi.api.spec.ISampleAPI;
import io.fylabs.sampleapi.dto.CreateSampleDTO;
import io.fylabs.sampleapi.dto.SampleDTO;
import io.fylabs.sampleapi.usecase.sample.CreateSampleUseCase;
import io.fylabs.sampleapi.usecase.sample.FindSampleUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SampleAPIAdapter implements ISampleAPI {

    private final CreateSampleUseCase createSampleUseCase;

    private final FindSampleUseCase findSampleUseCase;

    @Override
    public ResponseEntity<SampleDTO> createSample(CreateSampleDTO request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(createSampleUseCase.create(request));
    }

    @Override
    public ResponseEntity<SampleDTO> findSampleById(String sampleId) {
        return ResponseEntity.ok(findSampleUseCase.findById(sampleId));
    }
}