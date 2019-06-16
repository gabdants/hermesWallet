package com.fiesp.hermes.hermes.repository;

import com.fiesp.hermes.hermes.dao.GovUser;
import com.fiesp.hermes.hermes.dao.Token;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GovUserRepository extends MongoRepository<GovUser, String> {

    GovUser findByCpf(String cpf);

}

