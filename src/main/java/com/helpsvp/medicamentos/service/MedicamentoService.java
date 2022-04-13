package com.helpsvp.medicamentos.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.helpsvp.medicamentos.dto.MedicamentoDTO;
import com.helpsvp.medicamentos.entity.MedicamentoEntity;
import com.helpsvp.medicamentos.mapper.MedicamentoMapper;
import com.helpsvp.medicamentos.repository.MedicamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class MedicamentoService {

    private MedicamentoRepository repository;
    private final ObjectMapper objectMapper;

    public MedicamentoService(MedicamentoRepository repository, ObjectMapper objectMapper) {
        this.repository = repository;
        this.objectMapper = objectMapper;
    }

    public MedicamentoDTO findById(UUID id) {
        Optional<MedicamentoEntity> medicamento = this.repository.findById(id);
        return medicamento.map(MedicamentoMapper::toDTO).orElse(null);
    }

    public List<MedicamentoDTO> findAll() {
        List<MedicamentoEntity> medicamentos = this.repository.findAll();
        return medicamentos
                .stream()
                .map(MedicamentoMapper::toDTO)
                .collect(Collectors.toList());
    }

    public MedicamentoDTO save(MedicamentoEntity moradorEntity) {
        MedicamentoEntity medicamento = this.repository.save(moradorEntity);
        return MedicamentoMapper.toDTO(medicamento);
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