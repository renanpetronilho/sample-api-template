package io.fylabs.sampleapi.api.spec;

import io.fylabs.sampleapi.dto.CreateSampleDTO;
import io.fylabs.sampleapi.dto.SampleDTO;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface ISampleAPI {

    @PostMapping(value = "/samples", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<SampleDTO> createSample(@RequestBody CreateSampleDTO request);

    @GetMapping(value = "/samples/{sampleId}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<SampleDTO> findSampleById(@PathVariable String sampleId);
}
