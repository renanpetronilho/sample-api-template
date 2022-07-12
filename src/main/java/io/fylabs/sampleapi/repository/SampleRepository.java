package io.fylabs.sampleapi.repository;

import io.fylabs.sampleapi.entity.SampleEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SampleRepository extends MongoRepository<SampleEntity, String> {
}
