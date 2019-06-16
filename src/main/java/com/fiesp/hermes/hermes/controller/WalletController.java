package com.fiesp.hermes.hermes.controller;

import com.fiesp.hermes.hermes.dao.Cnh;
import com.fiesp.hermes.hermes.dao.ErrorMessage;
import com.fiesp.hermes.hermes.dao.Rg;
import com.fiesp.hermes.hermes.dao.Titulo;
import com.fiesp.hermes.hermes.repository.CnhRepository;
import com.fiesp.hermes.hermes.repository.RgRepository;
import com.fiesp.hermes.hermes.repository.TituloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;


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

    @GetMapping
    List<Object> getDocs(@RequestParam(name = "dc") String dc, HttpServletRequest request){

        String[] docs = dc.split(",");

        Rg rg = null;
        Cnh cnh = null;
        Titulo titulo = new Titulo();
        ErrorMessage errorMessage = new ErrorMessage();
        String token = request.getHeader("citizen_token");

        List<Object> list = new ArrayList<Object>();

        for(String x: docs){
            if (x.equalsIgnoreCase("rg")){
                Rg rg1 = RgRepository.findByToken(token);
                rg = RgRepository.findByCpf(rg1.getCpf());
                list.add(rg);
            }
            else if(x.equalsIgnoreCase("cnh")){
                Cnh cnh1 = CnhRepository.findByToken(token);
                cnh = CnhRepository.findByCpf(cnh1.getCpf());
                list.add(cnh);
            }
            else if(x.equalsIgnoreCase("titulo")){
                Titulo tit = TituloRepository.findByToken(token);
                titulo = TituloRepository.findByCpf(tit.getCpf());
                list.add(titulo);
            }
        }

        //Cnh cnh = CnhRepository.findByCpf(cpf);
        return list;
    }



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
