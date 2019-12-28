package com.rabbit.lancealance.model.lance;

import com.rabbit.lancealance.model.lance.enums.Posicao;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tab_equipe_jogador", schema = "lance")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = {"equipe", "jogador"})
@EqualsAndHashCode(exclude = {"equipe", "jogador"})
public class EquipeJogador implements Serializable {

    @Id
    @SequenceGenerator(name="equipe_jogador_seq", sequenceName="equipe_jogador_seq", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="equipe_jogador_seq")
    private Long id;

    @Column(nullable = false)
    private Integer numero;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Posicao posicao;

    @ManyToOne
    @JoinColumn(name = "id_equipe", foreignKey = @ForeignKey(name = "fk_equipe_jogador_equipe"), nullable = false)
    private Equipe equipe;

    @ManyToOne
    @JoinColumn(name = "id_jogador", foreignKey = @ForeignKey(name = "fk_equipe_jogador_jogador"), nullable = false)
    private Jogador jogador;
}
