package com.example.lms.repository;

import java.util.List;

public interface IRepositorio <T> {
    void salvar(T objeto);
    T buscarPorId(String id);
    List<T> buscarTodos();
    void atualizar(T objeto);
    void deletar(String id);
}
