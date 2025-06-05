package com.powerlink.service;

import com.powerlink.model.Ajuda;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AjudaService {
    private final List<Ajuda> pedidos = new ArrayList<>();

    public Ajuda solicitarAjuda(Ajuda ajuda) {
        pedidos.add(ajuda);
        return ajuda;
    }

    public Ajuda responderAjuda(String id) {
        for (Ajuda a : pedidos) {
            if (a.getId().equals(id)) {
                a.setRespondido(true);
                return a;
            }
        }
        return null;
    }

    public List<Ajuda> listarPendentes() {
        return pedidos.stream()
                      .filter(a -> !a.isRespondido())
                      .collect(Collectors.toList());
    }
}