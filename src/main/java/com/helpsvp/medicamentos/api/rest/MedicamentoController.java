package com.helpsvp.medicamentos.api.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.helpsvp.medicamentos.dto.MedicamentoDTO;
import com.helpsvp.medicamentos.entity.MedicamentoEntity;
import com.helpsvp.medicamentos.mapper.MedicamentoMapper;
import com.helpsvp.medicamentos.service.MedicamentoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("v1/medicamento")
public class MedicamentoController {

    private final MedicamentoService service;
    private final ObjectMapper objectMapper;

    public MedicamentoController(MedicamentoService service, ObjectMapper objectMapper) {
        this.service = service;
        this.objectMapper = objectMapper;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<MedicamentoDTO> findById(@PathVariable UUID id) {
        MedicamentoDTO obj = this.service.findById(id);
        return ResponseEntity.ok(obj);
    }

    @GetMapping(value = "/")
    public ResponseEntity<List<MedicamentoDTO>> findAll() {
        List<MedicamentoDTO> list = this.service.findAll();
        return ResponseEntity.ok(list);
    }

    @PostMapping(value = "/")
    public ResponseEntity<HttpStatus> save(@RequestBody MedicamentoDTO request) {
        MedicamentoEntity medicamentoEntity = MedicamentoMapper.toEntity(request);
        this.service.save(medicamentoEntity);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping(value = "/")
    public ResponseEntity<HttpStatus> update(@RequestBody MedicamentoDTO request) {
        MedicamentoEntity medicamentoEntity = MedicamentoMapper.toEntity(request);
        this.service.save(medicamentoEntity);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<HttpStatus> update(@PathVariable UUID id) {
        if (this.service.delete(id)) {
            return ResponseEntity.status(HttpStatus.OK).build();
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

    }
}