package com.fiap.myassist.core.business;

import com.fiap.myassist.core.domain.Usuario;

public interface UsuarioBusiness {
    Usuario criarUsuario(Usuario usuario);
    void login(String usuario, String senha);
    void deletar(Long id);
}
