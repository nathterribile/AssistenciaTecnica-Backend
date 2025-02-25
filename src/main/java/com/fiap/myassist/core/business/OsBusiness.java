package com.fiap.myassist.core.business;

import com.fiap.myassist.core.domain.Os;

import java.util.List;

public interface OsBusiness {
    Os cadastrar(Os os);
    Os consultar(Long id);
    List<Os> consultarTodos();
    Os atualizar(Long id, Os os);
}
