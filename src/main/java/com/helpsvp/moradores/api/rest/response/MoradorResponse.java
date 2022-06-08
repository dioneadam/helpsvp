package com.helpsvp.moradores.api.rest.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MoradorResponse {

    private String id;
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String contatoEmergencia;
    private String dataEntrada;

}
