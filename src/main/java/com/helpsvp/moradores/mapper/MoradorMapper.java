package com.helpsvp.moradores.mapper;

import com.helpsvp.moradores.dto.MoradorDTO;
import com.helpsvp.moradores.entity.MoradorEntity;

public class MoradorMapper {

    public static MoradorEntity toEntity(MoradorDTO moradorDTO) {
        return MoradorEntity.builder()
                .id(moradorDTO.getId())
                .nome(moradorDTO.getNome())
                .cpf(moradorDTO.getCpf())
                .data_nascimento(moradorDTO.getDataNascimento())
                .contato_emergencia(moradorDTO.getContatoEmergencia())
                .data_entrada(moradorDTO.getDataEntrada())
                .build();
    }

    public static MoradorDTO toDTO(MoradorEntity moradorEntity) {
        return MoradorDTO.builder()
                .id(moradorEntity.getId())
                .nome(moradorEntity.getNome())
                .cpf(moradorEntity.getCpf())
                .dataNascimento(moradorEntity.getData_nascimento())
                .contatoEmergencia(moradorEntity.getContato_emergencia())
                .dataEntrada(moradorEntity.getData_entrada())
                .build();
    }

}
