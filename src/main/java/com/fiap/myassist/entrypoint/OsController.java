package com.fiap.myassist.entrypoint;

import com.fiap.myassist.core.business.OsBusiness;
import com.fiap.myassist.core.domain.Os;
import com.fiap.myassist.entrypoint.dto.OsRequestDTO;
import com.fiap.myassist.entrypoint.dto.OsResponseDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/os")
public class OsController {
    @Autowired
    private OsBusiness osBusiness;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    OsResponseDTO cadastrar(@Valid @RequestBody OsRequestDTO request) {
        return new OsResponseDTO(osBusiness.cadastrar(new Os(request)));
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    OsResponseDTO consultarPorId(@Valid @NotNull @PathVariable Long id) {
        return new OsResponseDTO(osBusiness.consultar(id));
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<OsResponseDTO> consultarTodos() {
        List<OsResponseDTO> response = new ArrayList<>();

        osBusiness.consultarTodos().forEach(os -> {
            response.add(new OsResponseDTO(os));
        });

        return response;
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    OsResponseDTO atualizar(@Valid @RequestBody OsRequestDTO request,
                            @PathVariable @NotNull Long id) {
        return new OsResponseDTO(osBusiness.atualizar(id, new Os(request)));
    }
}
