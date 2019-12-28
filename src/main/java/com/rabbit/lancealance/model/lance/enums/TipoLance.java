package com.rabbit.lancealance.model.lance.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TipoLance {

    NORMAL(1L, "Normal"),
    PERIGO(2L, "Lance de Perigo"),
    GOL(3L, "Gol"),
    GOL_CONTRA(4L, "Gol contra"),
    FALTA(5L, "Falta"),
    IMPEDIMENTO(6L, "Impedimento"),
    SUBSTITUICAO(7L, "Substituição");

    private Long id;
    private String nome;

}
