package com.powerlink.service;

import com.powerlink.model.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioService {
    private final List<Usuario> usuarios = new ArrayList<>();

    public Usuario login(Usuario u) {
        usuarios.add(u);
        return u;
    }

    public List<Usuario> listarUsuarios() {
        return usuarios;
    }
}