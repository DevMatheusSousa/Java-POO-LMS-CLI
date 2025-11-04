package com.example;

import com.example.lms.model.Livro;
import com.example.lms.model.Usuario;
import com.example.lms.service.BibliotecaService;

public class MainApplication {
    public static void main(String[] args) {
       
        BibliotecaService bibliotecaService = new BibliotecaService();
        bibliotecaService.adicionarLivro(new Livro("1", "Livro 1", "Autor 1", "2020", "Editora 1", "1234567890", "Categoria 1", "Sim", ""));
        bibliotecaService.adicionarUsuario(new Usuario("1", "Usuario 1", "1234567890", "usuario1@gmail.com", "123456", "1234567890"));
        bibliotecaService.realizarEmprestimo("1", "1");
        bibliotecaService.realizarDevolucao("1");
        bibliotecaService.listarLivros();
    }
}