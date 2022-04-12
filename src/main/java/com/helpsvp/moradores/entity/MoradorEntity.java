package com.helpsvp.moradores.entity;

import com.helpsvp.moradores.dto.MoradorDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="MORADOR")
public class MoradorEntity implements Serializable {
        @Id
        @Column(updatable = false, nullable = false)
        private UUID id;
        private String nome;
        private String cpf;
        private Date data_nascimento;
        private String contato_emergencia;
        private Date data_entrada;

}
