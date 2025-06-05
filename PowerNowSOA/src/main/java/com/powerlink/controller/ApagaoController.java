package com.powerlink.controller;

import com.powerlink.model.Apagao;
import com.powerlink.service.ApagaoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apagao")
public class ApagaoController {

    private final ApagaoService apagaoService = new ApagaoService();

    @PostMapping
    public ResponseEntity<Apagao> registrar(@RequestBody Apagao apagao) {
        Apagao novo = apagaoService.registrar(apagao);
        return new ResponseEntity<>(novo, HttpStatus.CREATED);
    }

    @GetMapping
    public List<Apagao> listarTodos() {
        return apagaoService.listarTodos();
    }
}