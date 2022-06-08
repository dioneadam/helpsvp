package com.helpsvp.moradores.mapper;

import com.helpsvp.moradores.api.rest.request.MoradorRequest;
import com.helpsvp.moradores.api.rest.response.MoradorResponse;
import com.helpsvp.moradores.dto.MoradorDTO;
import com.helpsvp.moradores.entity.MoradorEntity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

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

    public static MoradorDTO toDTO(MoradorRequest moradorRequest) {

        UUID uuid = (moradorRequest.getId() != null) ? UUID.fromString(moradorRequest.getId()) : UUID.randomUUID();

        Date dataNascimento;
        Date dataEntrada;
        try {
            dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(moradorRequest.getDataNascimento());
            dataEntrada = new SimpleDateFormat("dd/MM/yyyy").parse(moradorRequest.getDataEntrada());
        } catch (Exception e) {
            dataNascimento = null;
            dataEntrada = null;
        }

        return MoradorDTO.builder()
                .id(uuid)
                .nome(moradorRequest.getNome())
                .cpf(moradorRequest.getCpf())
                .dataNascimento(dataNascimento)
                .contatoEmergencia(moradorRequest.getContatoEmergencia())
                .dataEntrada(dataEntrada)
                .build();
    }

    public static MoradorResponse toResponse(MoradorEntity moradorEntity) {

        String dataNascimento;
        String dataEntrada;
        try {
            dataNascimento = new SimpleDateFormat("dd/MM/yyyy").format(moradorEntity.getData_nascimento());
            dataEntrada = new SimpleDateFormat("dd/MM/yyyy").format(moradorEntity.getData_entrada());
        } catch (Exception e) {
            dataNascimento = null;
            dataEntrada = null;
        }

        return MoradorResponse.builder()
                .id(moradorEntity.getId().toString())
                .nome(moradorEntity.getNome())
                .cpf(moradorEntity.getCpf())
                .dataNascimento(dataNascimento)
                .contatoEmergencia(moradorEntity.getContato_emergencia())
                .dataEntrada(dataEntrada)
                .build();
    }

}
