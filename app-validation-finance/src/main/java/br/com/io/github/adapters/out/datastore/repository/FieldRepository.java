package br.com.io.github.adapters.out.datastore.repository;

import br.com.io.github.adapters.out.datastore.entity.FieldEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FieldRepository extends MongoRepository<FieldEntity, String> {
}
