package com.fiesp.hermes.hermes.repository;

import com.fiesp.hermes.hermes.dao.Cnh;
import com.fiesp.hermes.hermes.dao.Rg;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RgRepository extends MongoRepository<Rg, String> {

    Rg findByCpf(String cpf);
    Rg findByToken(String token);
    Rg findBy_id(String id);


}

