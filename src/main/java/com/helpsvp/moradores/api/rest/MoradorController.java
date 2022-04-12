package com.helpsvp.moradores.api.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.helpsvp.moradores.dto.MoradorDTO;
import com.helpsvp.moradores.entity.MoradorEntity;
import com.helpsvp.moradores.mapper.MoradorMapper;
import com.helpsvp.moradores.service.MoradorService;
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
@RequestMapping("v1/morador")
public class MoradorController {

    private final MoradorService service;
    private final ObjectMapper objectMapper;

    public MoradorController(MoradorService service, ObjectMapper objectMapper) {
        this.service = service;
        this.objectMapper = objectMapper;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<MoradorDTO> findById(@PathVariable UUID id) {
        MoradorDTO obj = this.service.findById(id);
        return ResponseEntity.ok(obj);
    }

    @GetMapping(value = "/")
    public ResponseEntity<List<MoradorDTO>> findAll() {
        List<MoradorDTO> list = this.service.findAll();
        return ResponseEntity.ok(list);
    }

    @PostMapping(value = "/")
    public ResponseEntity<HttpStatus> save(@RequestBody MoradorDTO request) {
        MoradorEntity moradorEntity = MoradorMapper.toEntity(request);
        this.service.save(moradorEntity);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping(value = "/")
    public ResponseEntity<HttpStatus> update(@RequestBody MoradorDTO request) {
        MoradorEntity moradorEntity = MoradorMapper.toEntity(request);
        this.service.save(moradorEntity);
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
