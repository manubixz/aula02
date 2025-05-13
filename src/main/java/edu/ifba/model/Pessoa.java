package edu.ifba.model;

import java.util.UUID;


public abstract class Pessoa{
    private UUID id;
    private String nome;
    private String whatsapp;
    private Genero genero;
    private Endereco endereco;
    private Usuario usuario;
    
    public Pessoa() {
    }

    public Pessoa(UUID id, String nome, String whatsapp, Genero genero, Endereco endereco, Usuario usuario) {
        this.id = id;
        this.nome = nome;
        this.whatsapp = whatsapp;
        this.genero = genero;
        this.endereco = endereco;
        this.usuario = usuario;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}