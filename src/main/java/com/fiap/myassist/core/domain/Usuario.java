package com.fiap.myassist.core.domain;

import com.fiap.myassist.entrypoint.dto.UsuarioRequestDTO;
import com.fiap.myassist.resources.repository.entity.UsuarioEntity;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    private String usuario;
    private String senha;
    private Long id;

    public Usuario(UsuarioRequestDTO request) {
        this.usuario = request.getUsuario();
        this.senha = request.getSenha();
    }

    public Usuario(UsuarioEntity entity) {
        if (entity == null) {
            return;
        }

        this.usuario = entity.getUsuario();
        this.senha = entity.getSenha();
        this.id = entity.getId();
    }
}
