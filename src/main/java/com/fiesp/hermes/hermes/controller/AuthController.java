package com.fiesp.hermes.hermes.controller;


import com.fiesp.hermes.hermes.dao.*;
import com.fiesp.hermes.hermes.repository.*;
import com.fiesp.hermes.hermes.utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@CrossOrigin
@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    GovUserRepository GovUserRepository;

    @Autowired
    TokenRepository TokenRepository;

    @Autowired
    CnhRepository CnhRepository;

    @Autowired
    RgRepository RgRepository;

    @Autowired
    TituloRepository TituloRepository;

    Util util = new Util();

    @GetMapping
    Object authenticate(@RequestParam(name = "cpf") String cpf, @RequestParam(name = "pass") String pass, HttpServletRequest request){
        String token = request.getHeader("app_token");
        ErrorMessage errorMessage = new ErrorMessage();
        GovUser user = new GovUser();
        user.setCpf(cpf);
        user.setPass(pass);

        try{
            Token djaman = TokenRepository.findByTokenid(token);
            if (djaman == null){
                errorMessage.setMessage("TOKEN INVALIDO");
                return errorMessage;
            }
            GovUser us = GovUserRepository.findByCpf(user.getCpf());
            if (us == null){
                errorMessage.setMessage("USUARIO INVALIDO");
                return errorMessage;
            }

            Token newToken = new Token();
            newToken.setTokenid(util.getRandomNumber());
            TokenRepository.save(newToken);

            String tok = util.getRandomNumber();

            Cnh cnh =  CnhRepository.findByCpf(us.getCpf());
            cnh.setToken(tok);
            CnhRepository.save(cnh);

            Rg rg = RgRepository.findByCpf(us.getCpf());
            rg.setToken(tok);
            RgRepository.save(rg);

            Titulo titulo =  TituloRepository.findByCpf(us.getCpf());
            titulo.setToken(tok);
            TituloRepository.save(titulo);

            UserToken userToken = new UserToken();
            userToken.setMessage("SUCCEEDED");
            userToken.setToken(tok);

            return userToken;




        }catch (Exception e){
            return e.getMessage();
        }

        //return "foi";
    }


}
