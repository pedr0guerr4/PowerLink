package com.powerlink.controller;

import com.powerlink.model.Usuario;
import com.powerlink.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService = new UsuarioService();

    @PostMapping("/login")
    public Usuario login(@RequestBody Usuario u) {
        return usuarioService.login(u);
    }

    @GetMapping
    public List<Usuario> listar() {
        return usuarioService.listarUsuarios();
    }
}