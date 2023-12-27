package org.hackaboss.c9d10ejercicio1.dto;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CursoDto {
    private String nombre;
    private LocalDate fechaFinalizacion;
}
