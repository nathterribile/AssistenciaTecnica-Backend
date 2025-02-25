package com.fiap.myassist.entrypoint.dto;

import com.fiap.myassist.core.domain.Os;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class OsResponseDTO {
    private Long id;
    private String proprietario;
    private String tipoEquipamento;
    private LocalDate entradaLab;
    private String defeito;
    private LocalDate previsaoEntrega;
    private String statusConcerto;
    private String observacoes;

    public OsResponseDTO(Os os) {
        this.id = os.getId();
        this.proprietario = os.getProprietario();
        this.tipoEquipamento = os.getTipoEquipamento();
        this.entradaLab = os.getEntradaLab();
        this.defeito = os.getDefeito();
        this.previsaoEntrega = os.getPrevisaoEntrega();
        this.statusConcerto = os.getStatusConcerto();
        this.observacoes = os.getObservacoes();
    }
}
