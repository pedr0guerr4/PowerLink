package com.powerlink.service;

import com.powerlink.model.Apagao;
import java.util.ArrayList;
import java.util.List;

public class ApagaoService {
    private final List<Apagao> apagoes = new ArrayList<>();

    public Apagao registrar(Apagao apagao) {
        apagoes.add(apagao);
        return apagao;
    }

    public List<Apagao> listarTodos() {
        return apagoes;
    }
}