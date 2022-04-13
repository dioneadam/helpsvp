package com.helpsvp.medicamentos.mapper;

import com.helpsvp.medicamentos.dto.MedicamentoDTO;
import com.helpsvp.medicamentos.entity.MedicamentoEntity;

public class MedicamentoMapper {

    public static MedicamentoEntity toEntity(MedicamentoDTO medicamentoDTO) {
        return MedicamentoEntity.builder()
                .id(medicamentoDTO.getId())
                .nome_comercial(medicamentoDTO.getNome_comercial())
                .nome_quimico(medicamentoDTO.getNome_quimico())
                .data_cadastramento(medicamentoDTO.getData_cadastramento())
                .quantidade_minima(medicamentoDTO.getQuantidade_minima())
                .unidade_de_medida(medicamentoDTO.getUnidade_de_medida())
                .tipo_embalagem(medicamentoDTO.getTipo_embalagem())
                .quantidade(medicamentoDTO.getQuantidade())
                .validade(medicamentoDTO.getValidade())
                .resumo(medicamentoDTO.getResumo())
                .build();
    }

    public static MedicamentoDTO toDTO(MedicamentoEntity medicamentoEntity) {
        return MedicamentoDTO.builder()
                .id(medicamentoEntity.getId())
                .nome_comercial(medicamentoEntity.getNome_comercial())
                .nome_quimico(medicamentoEntity.getNome_quimico())
                .data_cadastramento(medicamentoEntity.getData_cadastramento())
                .quantidade_minima(medicamentoEntity.getQuantidade_minima())
                .unidade_de_medida(medicamentoEntity.getUnidade_de_medida())
                .tipo_embalagem(medicamentoEntity.getTipo_embalagem())
                .quantidade(medicamentoEntity.getQuantidade())
                .validade(medicamentoEntity.getValidade())
                .resumo(medicamentoEntity.getResumo())
                .build();
    }
}
