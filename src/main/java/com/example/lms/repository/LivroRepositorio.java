package com.example.lms.repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import com.example.lms.model.Livro;

public class LivroRepositorio implements IRepositorio<Livro> {

    private File caminhoDoArquivo =  new File("src/main/resources/livros.json");
    private List<Livro> livros = new ArrayList<Livro>();

    @Override
    public void salvar(Livro livro) {
        livros.add(livro);
    }

    @Override
    public Livro buscarPorId(String id) {
        return livros.stream()
        .filter(livro -> livro.getId().equals(id))
        .findFirst()
        .orElse(null);
    }

    @Override
    public List<Livro> buscarTodos() {
        return livros;
    }

    @Override
    public void atualizar(Livro livro) {
        livros.set(livros.indexOf(livro), livro);
    }

    @Override
    public void deletar(String id) {
        livros.removeIf(livro -> livro.getId().equals(id));
    }

    //ler File e converter para List<Livro>
    public List<Livro> lerArquivo() {
        List<Livro> livros = new ArrayList<Livro>();
        if (caminhoDoArquivo.exists()) {
            try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(caminhoDoArquivo))) {
                livros = (List<Livro>) input.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return livros;
    }
}
