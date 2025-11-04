package com.example.lms.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Livro {
    private String id = UUID.randomUUID().toString();
    private String titulo;
    private String autor;
    private String ano;
    private String editora;
    private String ISBN;
    private String categoria;
    private String disponivel;
    private String emprestado;
    private LocalDate dataEmprestimo;

    public Livro(String id, String titulo, String autor, String ano, String editora, String ISBN, 
    String categoria, String disponivel, String emprestado){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.editora = editora;
        this.ISBN = ISBN;
        this.categoria = categoria;
        this.disponivel = disponivel;
        this.emprestado = emprestado;
        this.dataEmprestimo = LocalDate.now();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(String disponivel) {
        this.disponivel = disponivel;
    }

    public String getEmprestado() {
        return emprestado;
    }

    public void setEmprestado(String emprestado) {
        this.emprestado = emprestado;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }


    @Override
    public String toString(){
        return "ID: " + id + ", Titulo: " + titulo + ", Autor: " + autor + ", Ano: " + ano + ", Editora: " + editora + ", ISBN: " 
        + ISBN + ", Categoria: " + categoria + ", Disponivel: " + disponivel + ", Emprestado: " + emprestado + ", Data de Empréstimo: " + getDataEmprestimo().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
