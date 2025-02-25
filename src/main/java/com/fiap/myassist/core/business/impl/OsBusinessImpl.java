package com.fiap.myassist.core.business.impl;

import com.fiap.myassist.core.business.OsBusiness;
import com.fiap.myassist.core.domain.Os;
import com.fiap.myassist.core.service.OsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OsBusinessImpl implements OsBusiness {
    @Autowired
    private OsService osService;

    @Override
    public Os cadastrar(final Os os) {
        return osService.cadastrar(os);
    }

    @Override
    public Os consultar(final Long id) {
        return osService.consultar(id);
    }

    @Override
    public List<Os> consultarTodos() {
        return osService.consultarTodos();
    }

    @Override
    public Os atualizar(final Long id, final Os os) {
        //Não atualizar quando os finalizada

        return osService.atualizar(id, os);
    }
}
