package br.pucrs.nomeusuario.exemplo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ExemploControllerRaiz {

    @GetMapping("")
    public String getMensagemInicial() {
        return "Aplicacao Spring-Boot funcionando, com 2 controllers!";
    }
}
