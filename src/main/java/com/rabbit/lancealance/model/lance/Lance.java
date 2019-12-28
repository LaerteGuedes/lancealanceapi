package com.rabbit.lancealance.model.lance;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.rabbit.lancealance.model.lance.enums.TipoLance;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "tab_lance", schema = "lance")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"partidaEquipe", "partida", "partidaEquipeJogador"})
@EqualsAndHashCode(exclude = {"partidaEquipe", "partida", "partidaEquipeJogador"})
public class Lance implements Serializable {

    @Id
    @SequenceGenerator(name="lance_seq", sequenceName="lance_seq", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="lance_seq")
    private Long id;

    @Column(nullable = false)
    private String descricao;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoLance tipoLance;

    @Column(nullable = false)
    private LocalDateTime tempo;

    @ManyToOne
    @JoinColumn(name = "id_partida", nullable = false, foreignKey = @ForeignKey(name = "fk_lance_partida"))
    @JsonIgnore
    private Partida partida;

    @ManyToOne
    @JoinColumn(name = "id_partida_equipe", foreignKey = @ForeignKey(name = "fk_lance_partida_equipe"))
    @JsonIgnoreProperties(value = {"placar", "esquemaTatico", "jogadores"})
    private PartidaEquipe partidaEquipe;

    @ManyToOne
    @JoinColumn(name = "id_partida_equipe_jogador", foreignKey = @ForeignKey(name = "fk_lance_partida_equipe_jogador"))
    @JsonIgnoreProperties(value = {"gols", "cartaoAmarelo", "cartaoVermelho", "titulo", "substituido", "entrouSubstituicao", "posicao", "equipe"})
    private PartidaEquipeJogador partidaEquipeJogador;

}
