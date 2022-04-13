package com.helpsvp.medicamentos.entity;

import com.helpsvp.medicamentos.dto.MedicamentoDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="MEDICAMENTO")
public class MedicamentoEntity implements Serializable {
    @Id
    @Column(updatable = false, nullable = false)

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


