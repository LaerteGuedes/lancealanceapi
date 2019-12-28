package com.rabbit.lancealance.model.lance.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Posicao {

    GOLEIRO(1L, "Goleiro"),
    ZAGUEIRO(2L, "Zagueiro"),
    LATERAL_DIREITO(3L, "Lateral direito"),
    LATERAL_ESQUERDO(4L, "Lateral esquerdo"),
    VOLANTE(5L, "Volante"),
    MEIO_CAMPO_CENTRAL(6L, "Meio campo central"),
    ALA_DIREITO(7L, "Ala direito"),
    ALA_ESQUERDO(8L, "Ala esquerdo"),
    ATACANTE(9L, "Atacante"),
    CENTROAVANTE(10L, "Centroavante"),
    PONTA_DIREITA(11L, "Ponta direita"),
    PONTA_ESQUERDA(12L, "Ponta esquerda")
    ;

    private Long id;
    private String nome;

}
