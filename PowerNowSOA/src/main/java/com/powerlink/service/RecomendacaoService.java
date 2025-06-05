package com.powerlink.service;

import com.powerlink.model.Recomendacao;
import java.util.Arrays;
import java.util.List;

public class RecomendacaoService {

    public List<Recomendacao> listar() {
        return Arrays.asList(
                new Recomendacao() {{ setId("1"); setTexto("Mantenha lanternas carregadas."); }},
                new Recomendacao() {{ setId("2"); setTexto("Evite abrir a geladeira em apagões longos."); }},
                new Recomendacao() {{ setId("3"); setTexto("Tenha água potável reservada."); }}
        );
    }
}