package com.rabbit.lancealance.model.lance;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "tab_partida", schema = "lance")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = {"equipeCasa", "equipeVisitante"})
@EqualsAndHashCode(exclude = {"equipeCasa", "equipeVisitante"})
public class Partida implements Serializable {

    @Id
    @SequenceGenerator(name="partida_seq", sequenceName="partida_seq", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="partida_seq")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_equipe_casa", foreignKey = @ForeignKey(name = "fk_partida_equipe_casa"), nullable = false)
    private PartidaEquipe equipeCasa;

    @ManyToOne
    @JoinColumn(name = "id_equipe_visitante", foreignKey = @ForeignKey(name = "fk_partida_equipe_visitante"), nullable = false)
    private PartidaEquipe equipeVisitante;

    @Column(name = "hora_inicio", nullable = false)
    private LocalDateTime horaInicio;

}
