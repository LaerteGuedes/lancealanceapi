package com.rabbit.lancealance.model.lance;

import com.rabbit.lancealance.model.lance.enums.Posicao;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tab_jogador", schema = "lance")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Jogador implements Serializable {

    @Id
    @SequenceGenerator(name="jogador_seq", sequenceName="jogador_seq", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="jogador_seq")
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Posicao posicao;


}
