package com.helpsvp.moradores.api.rest.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MoradorRequest {

    @Nullable
    private String id;
    private String nome;
    private String cpf;
    @Nullable
    private String dataNascimento;
    @Nullable
    private String contatoEmergencia;
    @Nullable
    private String dataEntrada;

}
