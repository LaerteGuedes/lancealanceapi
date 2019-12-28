package com.rabbit.lancealance.model.lance;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.rabbit.lancealance.model.lance.enums.Posicao;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tab_partida_equipe_jogador", schema = "lance")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = {"jogador"})
@EqualsAndHashCode(exclude = {"jogador"})
public class PartidaEquipeJogador implements Serializable {

    @Id
    @SequenceGenerator(name="partida_equipe_jogador_seq", sequenceName="partida_equipe_jogador_seq", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="partida_equipe_jogador_seq")
    private Long id;

    @Column(nullable = false)
    private Integer gols;

    @Column(name = "cartao_amarelo", nullable = false)
    private Boolean cartaoAmarelo;

    @Column(name = "cartao_vermelho", nullable = false)
    private Boolean cartaoVermelho;

    @Column(nullable = false)
    private Boolean titular;

    @Column(nullable = false)
    private Boolean substituido;

    @Column(nullable = false, name = "entrou_substituicao")
    private Boolean entrouSubstituicao;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Posicao posicao;

    @ManyToOne
    @JoinColumn(name = "id_equipe_jogador", foreignKey = @ForeignKey(name = "fk_partida_equipe_jogador_jogador"))
    @JsonIgnoreProperties(value = {"titular"})
    private EquipeJogador jogador;

    @ManyToOne
    @JoinColumn(name = "id_partida_equipe", foreignKey = @ForeignKey(name = "fk_partida_equipe_equipe"))
    @JsonIgnore
    private PartidaEquipe equipe;

}
