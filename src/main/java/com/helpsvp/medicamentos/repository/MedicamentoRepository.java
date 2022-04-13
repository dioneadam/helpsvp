package com.helpsvp.medicamentos.repository;

import com.helpsvp.medicamentos.entity.MedicamentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MedicamentoRepository extends JpaRepository<MedicamentoEntity, UUID> { }
