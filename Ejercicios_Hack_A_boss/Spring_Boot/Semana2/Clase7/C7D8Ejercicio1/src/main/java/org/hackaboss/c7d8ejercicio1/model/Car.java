package org.hackaboss.c7d8ejercicio1.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Car {

    private Long id;
    private String brand;
    private String model;
    private Integer kilometers;
    private Integer doors;
    private Double price;

}
