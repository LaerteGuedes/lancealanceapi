package com.rabbit.lancealance.model.lance;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "tab_equipe", schema = "lance")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Equipe implements Serializable {

    @Id
    @SequenceGenerator(name="equipe_seq", sequenceName="equipe_seq", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="equipe_seq")
    private Long id;

    @Column(nullable = false)
    private String nome;

    private byte[] escudo;

    @Column(name = "data_cadastro", nullable = false)
    private LocalDateTime dataCadastro;

    @Column(nullable = false)
    private Boolean ativa;
}
