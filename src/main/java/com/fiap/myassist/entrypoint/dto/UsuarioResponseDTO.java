package com.fiap.myassist.entrypoint.dto;

import com.fiap.myassist.core.domain.Usuario;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioResponseDTO {
    private String usuario;
    private String senha;
    private Long id;

    public UsuarioResponseDTO(Usuario usuario) {
        this.senha = usuario.getSenha();
        this.usuario = usuario.getUsuario();
        this.id = usuario.getId();
    }
}
