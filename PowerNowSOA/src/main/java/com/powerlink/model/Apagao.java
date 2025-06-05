package com.powerlink.model;

import java.time.LocalDateTime;

public class Apagao {
    private String usuarioId;
    private String bairro;
    private String cep;
    private LocalDateTime inicio;
    private String descricao;
    private int duracaoEstimada;

    // Getters e Setters
    public String getUsuarioId() { return usuarioId; }
    public void setUsuarioId(String usuarioId) { this.usuarioId = usuarioId; }

    public String getBairro() { return bairro; }
    public void setBairro(String bairro) { this.bairro = bairro; }

    public String getCep() { return cep; }
    public void setCep(String cep) { this.cep = cep; }

    public LocalDateTime getInicio() { return inicio; }
    public void setInicio(LocalDateTime inicio) { this.inicio = inicio; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public int getDuracaoEstimada() { return duracaoEstimada; }
    public void setDuracaoEstimada(int duracaoEstimada) { this.duracaoEstimada = duracaoEstimada; }
}