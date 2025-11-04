package com.example.lms.model;

import java.time.LocalDate;

public class Usuario extends pessoa {
    private String matricula;;
    private LocalDate dataCadastro;

    public Usuario(String id, String nome, String telefone, String email, String senha, String matricula){
        super(id, nome, telefone);
        this.matricula = matricula;
        this.dataCadastro = LocalDate.now();
    }

    public String getMatricula(){
        return matricula;
    }

    public LocalDate getDataCadastro(){
        return dataCadastro;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public void setDataCadastro(LocalDate dataCadastro){
        this.dataCadastro = dataCadastro;
    }

    @Override
    String getTipoDePessoa() {
        return "Usuario";
    }

    @Override
    public String toString(){
        return super.toString() + ", Matricula: " + matricula + ", Data de Cadastro: " + dataCadastro;
    }
    
    
}
