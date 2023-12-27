package org.hackaboss.c9d10ejercicio1.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Curso {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_curso")
    private Long id;
    private String nombre;
    @Column(name = "tipo_curso")
    private String tipo;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "fecha_finalizacion")
    private LocalDate fechaFinalizacion;

    @JsonManagedReference
    @OneToMany(mappedBy = "curso", cascade = CascadeType.ALL)
    private List<Tema> temas = new ArrayList<>();


}
