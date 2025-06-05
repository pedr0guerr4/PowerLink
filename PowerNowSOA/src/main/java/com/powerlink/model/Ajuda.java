package com.powerlink.model;

public class Ajuda {
    private String id;
    private String usuarioId;
    private String descricao;
    private boolean respondido;

    // Getters e Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getUsuarioId() { return usuarioId; }
    public void setUsuarioId(String usuarioId) { this.usuarioId = usuarioId; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public boolean isRespondido() { return respondido; }
    public void setRespondido(boolean respondido) { this.respondido = respondido; }
}