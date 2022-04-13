package com.helpsvp.medicamentos.dto;

import com.helpsvp.medicamentos.entity.MedicamentoEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MedicamentoDTO {

    private UUID id;
    private String nome_comercial;
    private String nome_quimico;
    private Date data_cadastramento;
    private Integer quantidade_minima;
    private String unidade_de_medida;
    private String tipo_embalagem;
    private Integer quantidade;
    private Date validade;
    private String resumo;
}

