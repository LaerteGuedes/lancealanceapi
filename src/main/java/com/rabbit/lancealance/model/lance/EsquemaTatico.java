package com.rabbit.lancealance.model.lance;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tab_esquema_tatico", schema = "lance")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class EsquemaTatico implements Serializable {

    @Id
    @SequenceGenerator(name="esquema_tatico_seq", sequenceName="esquema_tatico_seq", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="esquema_tatico_seq")
    private Long id;

    @Column(nullable = false)
    private String nome;

}
