package com.powerlink.controller;

import com.powerlink.model.Recomendacao;
import com.powerlink.service.RecomendacaoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recomendacoes")
public class RecomendacaoController {

    private final RecomendacaoService service = new RecomendacaoService();

    @GetMapping
    public List<Recomendacao> listar() {
        return service.listar();
    }
}