package com.helpsvp.moradores.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.helpsvp.moradores.dto.MoradorDTO;
import com.helpsvp.moradores.entity.MoradorEntity;
import com.helpsvp.moradores.mapper.MoradorMapper;
import com.helpsvp.moradores.repository.MoradorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class MoradorService {

    private MoradorRepository repository;
    private final ObjectMapper objectMapper;

    public MoradorService(MoradorRepository repository, ObjectMapper objectMapper) {
        this.repository = repository;
        this.objectMapper = objectMapper;
    }

    public MoradorDTO findById(UUID id) {
        Optional<MoradorEntity> morador = this.repository.findById(id);
        return morador.map(MoradorMapper::toDTO).orElse(null);
    }

    public List<MoradorDTO> findAll() {
        List<MoradorEntity> moradores = this.repository.findAll();
        return moradores
                .stream()
                .map(MoradorMapper::toDTO)
                .collect(Collectors.toList());
    }

    public MoradorDTO save(MoradorEntity moradorEntity) {
        MoradorEntity morador = this.repository.save(moradorEntity);
        return MoradorMapper.toDTO(morador);
    }

    public Boolean delete(UUID id) {
        try {
            this.repository.deleteById(id);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }

}
