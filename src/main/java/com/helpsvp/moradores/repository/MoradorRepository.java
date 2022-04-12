package com.helpsvp.moradores.repository;

import com.helpsvp.moradores.entity.MoradorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MoradorRepository extends JpaRepository<MoradorEntity, UUID> { }
