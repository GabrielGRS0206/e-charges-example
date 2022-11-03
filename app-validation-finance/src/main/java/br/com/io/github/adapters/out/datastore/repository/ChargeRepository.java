package br.com.io.github.adapters.out.datastore.repository;

import br.com.io.github.adapters.out.datastore.entity.ChargeEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChargeRepository extends MongoRepository<ChargeEntity, String> {
}
