package com.helpsvp.moradores.dto;

import com.helpsvp.moradores.entity.MoradorEntity;
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
public class MoradorDTO {

    private UUID id;
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private String contatoEmergencia;
    private Date dataEntrada;

}
