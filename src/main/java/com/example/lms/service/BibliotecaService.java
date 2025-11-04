package com.example.lms.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.lms.model.Livro;
import com.example.lms.model.Usuario;
import com.example.lms.repository.LivroRepositorio;
import com.example.lms.repository.UsuarioRepositorio;

public class BibliotecaService {
    private LivroRepositorio livroRepositorio = new LivroRepositorio();
    private UsuarioRepositorio usuarioRepositorio = new UsuarioRepositorio();

    public void adicionarLivro(Livro livro) {
        livroRepositorio.salvar(livro);
        System.out.println("Livro adicionado com sucesso");

        }

        public void adicionarUsuario(Usuario usuario) {
        usuarioRepositorio.salvar(usuario);
        System.out.println("Usuario adicionado com sucesso");
    }

    public void realizarEmprestimo(String idLivro, String idUsuario) {
        Livro livro = livroRepositorio.buscarPorId(idLivro);
        Usuario usuario = usuarioRepositorio.buscarPorId(idUsuario);
        if(livro == null || usuario == null) {
            System.out.println("Livro ou usuario não encontrado");
            return;
        }

        try {
            livro.setDisponivel("Não");
            livro.setEmprestado(usuario.getNome());
        } catch (Exception e) {
            System.out.println("Erro ao realizar empréstimo");
            return;
        }
    }

    public void realizarDevolucao(String idLivro) {
        Livro livro = livroRepositorio.buscarPorId(idLivro);
        if(livro == null) {
            System.out.println("Livro não encontrado");
            return;
        }
        try {
            livro.setDisponivel("Sim");
            System.out.println("Devolução realizada com sucesso");
        } catch (Exception e) {
            System.out.println("Erro ao realizar devolução");
            return;
        }
    }

    public void listarLivros() {
        List<Livro> livros = livroRepositorio.buscarTodos();
        for(Livro livro : livros) {
            System.out.println(livro);
        }
    }
}
