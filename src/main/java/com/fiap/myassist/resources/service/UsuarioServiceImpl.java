package com.fiap.myassist.resources.service;

import com.fiap.myassist.core.domain.Usuario;
import com.fiap.myassist.core.service.UsuarioService;
import com.fiap.myassist.resources.repository.UsuarioRepository;
import com.fiap.myassist.resources.repository.entity.UsuarioEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario criarUsuario(final Usuario usuario) {
//        UsuarioEntity entity = new UsuarioEntity();
//        entity.setUsuario(usuario.getUsuario());
//        entity.setSenha(usuario.getSenha());
//
//        UsuarioEntity newEntity = usuarioRepository.save(entity);
//
//        Usuario newUsuario = new Usuario();
//        newUsuario.setSenha(newEntity.getSenha());
//        newUsuario.setUsuario(newEntity.getUsuario());
//
//        return newUsuario;
        return new Usuario(usuarioRepository.save(new UsuarioEntity(usuario)));
    }

    @Override
    public Usuario obterUsuarioPorUsuarioESenha(final String usuario, final String senha) {
        return new Usuario(usuarioRepository.findByUsuarioAndSenha(usuario, senha));
    }

    @Override
    public void deletar(final Long id) {
        usuarioRepository.delete(usuarioRepository.findById(id).orElse(new UsuarioEntity()));
    }
}
