package com.fiesp.hermes.hermes.repository;

import com.fiesp.hermes.hermes.dao.Cnh;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CnhRepository extends MongoRepository<Cnh, String> {

    Cnh findByCpf(String cpf);


}

