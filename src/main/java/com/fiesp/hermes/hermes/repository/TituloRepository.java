package com.fiesp.hermes.hermes.repository;

import com.fiesp.hermes.hermes.dao.Titulo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TituloRepository extends MongoRepository<Titulo, String> {

    Titulo findByCpf(String cpf);


}

