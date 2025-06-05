package com.powerlink.controller;

import com.powerlink.model.Ajuda;
import com.powerlink.service.AjudaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ajuda")
public class AjudaController {

    private final AjudaService ajudaService = new AjudaService();

    @PostMapping("/solicitar")
    public ResponseEntity<Ajuda> solicitar(@RequestBody Ajuda ajuda) {
        return ResponseEntity.ok(ajudaService.solicitarAjuda(ajuda));
    }

    @PostMapping("/responder/{id}")
    public ResponseEntity<Ajuda> responder(@PathVariable String id) {
        Ajuda ajuda = ajudaService.responderAjuda(id);
        if (ajuda != null) return ResponseEntity.ok(ajuda);
        else return ResponseEntity.notFound().build();
    }

    @GetMapping
    public List<Ajuda> listarPendentes() {
        return ajudaService.listarPendentes();
    }
}