package org.hackaboss.c9d10ejercicio1.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Tema {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_tema")
    private Long id;
    private String nombre;
    private String descripcion;
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Curso curso;
}
