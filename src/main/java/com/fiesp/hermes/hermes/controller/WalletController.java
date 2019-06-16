package com.fiesp.hermes.hermes.controller;

import com.fiesp.hermes.hermes.dao.Cnh;
import com.fiesp.hermes.hermes.dao.Rg;
import com.fiesp.hermes.hermes.dao.Titulo;
import com.fiesp.hermes.hermes.repository.CnhRepository;
import com.fiesp.hermes.hermes.repository.RgRepository;
import com.fiesp.hermes.hermes.repository.TituloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@RequestMapping("/wallet")
public class WalletController {

    @Autowired
    CnhRepository CnhRepository;

    @Autowired
    RgRepository RgRepository;

    @Autowired
    TituloRepository TituloRepository;

    @GetMapping(value = "/cnh")
    Cnh getCnhByCpf(@RequestParam(name = "cpf") String cpf){
        Cnh cnh = CnhRepository.findByCpf(cpf);
        return cnh;
    }

    @GetMapping(value = "/rg")
    Rg getRgByCpf(@RequestParam(name = "cpf") String cpf){
        Rg rg = RgRepository.findByCpf(cpf);
        return rg;
    }

    @GetMapping(value = "/titulo")
    Titulo geTituloByCpf(@RequestParam(name = "cpf") String cpf){
        Titulo titulo = TituloRepository.findByCpf(cpf);
        return titulo;
    }

}
