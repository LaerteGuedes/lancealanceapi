package com.rabbit.lancealance.model.lance;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "tab_partida_equipe", schema = "lance")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = {"esquemaTatico", "equipe"})
@EqualsAndHashCode(exclude = {"esquemaTatico", "equipe"})
public class PartidaEquipe implements Serializable {

    @Id
    @SequenceGenerator(name="partida_equipe_seq", sequenceName="partida_equipe_seq", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="partida_equipe_seq")
    private Long id;

    @Column(nullable = false)
    private Integer placar;

    @ManyToOne
    @JoinColumn(name = "id_esquema_tatico", foreignKey = @ForeignKey(name = "fk_equipe_jogador_esquema_tatico"), nullable = false)
    private EsquemaTatico esquemaTatico;

    @ManyToOne
    @JoinColumn(name = "id_equipe", foreignKey = @ForeignKey(name = "fk_partida_equipe_equipe"), nullable = false)
    @JsonIgnoreProperties(value = {"escudo", "dataCadastro", "ativa"})
    private Equipe equipe;

    @OneToMany(mappedBy = "equipe")
    private List<PartidaEquipeJogador> jogadores;

}
