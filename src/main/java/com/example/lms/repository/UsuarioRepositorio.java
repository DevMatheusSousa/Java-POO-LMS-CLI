package com.example.lms.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.lms.model.Usuario;

public class UsuarioRepositorio implements IRepositorio<Usuario> {

    private List<Usuario> usuarios = new ArrayList<Usuario>();

    @Override
    public void atualizar(Usuario user) {
        usuarios.set(usuarios.indexOf(user), user);
    }

    @Override
    public Usuario buscarPorId(String id) {
        return usuarios.stream()
        .filter(usuario -> usuario.getId().equals(id))
        .findFirst() //-> retorna o primeiro elemento que encontrar
        .orElse(null); //-> se não encontrar, retorna null
    }

    @Override
    public List<Usuario> buscarTodos() {
        
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
        return usuarios;
    }

    @Override
    public void deletar(String id) {
        usuarios.removeIf(usuario -> usuario.getId().equals(id));
    }

    @Override
    public void salvar(Usuario user) {
        if(user == null) {
            throw new IllegalArgumentException("Usuario não pode ser nulo ou vazio");
        }
        usuarios.add(user);
    }


}
