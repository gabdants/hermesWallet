package com.fiesp.hermes.hermes.repository;

import com.fiesp.hermes.hermes.dao.Cnh;
import com.fiesp.hermes.hermes.dao.Token;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TokenRepository extends MongoRepository<Token, String> {

    Token findByTokenid(String tokenid);


}

