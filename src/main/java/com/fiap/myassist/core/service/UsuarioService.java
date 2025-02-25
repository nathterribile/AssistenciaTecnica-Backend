package com.fiap.myassist.core.service;

import com.fiap.myassist.core.domain.Usuario;

public interface UsuarioService {
    Usuario criarUsuario(Usuario usuario);
    Usuario obterUsuarioPorUsuarioESenha(String usuario, String senha);
    void deletar(Long id);
}
