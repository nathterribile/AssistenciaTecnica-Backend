package com.fiap.myassist.entrypoint;

import com.fiap.myassist.core.business.UsuarioBusiness;
import com.fiap.myassist.core.domain.Usuario;
import com.fiap.myassist.entrypoint.dto.UsuarioRequestDTO;
import com.fiap.myassist.entrypoint.dto.UsuarioResponseDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioBusiness usuarioBusiness;

    @PostMapping("/cadastrar")
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioResponseDTO cadastrarUsuario(@Valid @RequestBody UsuarioRequestDTO request) {
//        Construtor manual
       //Usuario usuario = new Usuario();
       //usuario.setUsuario(request.getUsuario());
       //usuario.setSenha(request.getSenha());

//        Construtor por objeto
//        Usuario usuario1 = new Usuario(request);

        return new UsuarioResponseDTO(
                usuarioBusiness.criarUsuario(
//              Construtor pattern
                        Usuario.builder()
                                .usuario(request.getUsuario())
                                .senha(request.getSenha())
                                .build()
                )
        );
    }

    @PostMapping("/login")
    @ResponseStatus(HttpStatus.OK)
    public void login(@RequestParam("usuario") @Valid @NotBlank String usuario,
                      @RequestParam("senha") @Valid @NotBlank String senha) {
        usuarioBusiness.login(usuario, senha);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deletar(@PathVariable @NotNull @Valid Long id) {
        usuarioBusiness.deletar(id);
    }
}
