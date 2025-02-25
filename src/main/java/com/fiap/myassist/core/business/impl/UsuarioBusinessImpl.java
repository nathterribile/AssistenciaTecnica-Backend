package com.fiap.myassist.core.business.impl;

import com.fiap.myassist.commom.exceptions.UnprocessableException;
import com.fiap.myassist.core.business.UsuarioBusiness;
import com.fiap.myassist.core.domain.Usuario;
import com.fiap.myassist.core.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UsuarioBusinessImpl implements UsuarioBusiness {
    @Autowired
    private UsuarioService usuarioService;

    @Override
    public Usuario criarUsuario(final Usuario usuario) {
        //Validar se usuario já existe

        return usuarioService.criarUsuario(usuario);
    }

    @Override
    public void login(final String usuario, final String senha) {
        if (usuarioService.obterUsuarioPorUsuarioESenha(usuario, senha).getUsuario() == null) {
            throw new UnprocessableException("Usuario e senha não encontrado");
        }
    }

    @Override
    public void deletar(final Long id) {
        usuarioService.deletar(id);
    }
}
