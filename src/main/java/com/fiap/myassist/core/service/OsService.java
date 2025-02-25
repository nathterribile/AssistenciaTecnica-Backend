package com.fiap.myassist.core.service;

import com.fiap.myassist.core.domain.Os;

import java.util.List;

public interface OsService {
    Os cadastrar(Os os);
    Os consultar(Long id);
    List<Os> consultarTodos();
    Os atualizar(Long id, Os os);
}
