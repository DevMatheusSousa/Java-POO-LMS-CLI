package com.example.lms.model;

import java.util.UUID;

public abstract class pessoa{
    private String id = UUID.randomUUID().toString();
    private String nome;
    private String telefone;

    public pessoa(String id, String nome, String telefone){
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    abstract String getTipoDePessoa();

    @Override
    public String toString(){
        return "ID: " + id + ", Nome: " + nome + ", Telefone: " + telefone + ", Tipo de Pessoa: " + getTipoDePessoa();
    }
}