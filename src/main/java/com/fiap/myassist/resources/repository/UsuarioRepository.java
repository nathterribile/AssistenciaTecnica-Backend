package com.fiap.myassist.resources.repository;

import com.fiap.myassist.resources.repository.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
    UsuarioEntity findByUsuarioAndSenha(String usuario, String senha);
}
