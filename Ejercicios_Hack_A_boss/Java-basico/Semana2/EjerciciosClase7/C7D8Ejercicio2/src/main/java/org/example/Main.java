package org.example;

import org.example.logica.Platillo;
import org.example.persistencia.ControladoraPersistencia;

import javax.swing.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();
        Platillo platillo1 = new Platillo(1L, "Cazuela de patatas", "Patata, cebolla y caldo",15.50);
        Platillo platillo2 = new Platillo(2L, "Gazpacho", "Tomates, pimientos y cebolla", 9.99);
        Platillo platillo3 = new Platillo(3L, "Boquerones fritos", "boquerones y aceite", 14.50);


        //Damos de alta el primer plato
//        controladoraPersistencia.crearPlatillo(platillo1);
//        controladoraPersistencia.crearPlatillo(platillo2);
//        controladoraPersistencia.crearPlatillo(platillo3);

        //Eliminar el segundo plato
        controladoraPersistencia.borrarPlatillo(platillo2.getId());

        //Actualizar platillo 3
        platillo3.setPrecio(10.00);
        platillo3.setNombre("Patatas Fritas con huevos");
        platillo3.setReceta("Patatas y huevos");
        controladoraPersistencia.actualizarPlatillo(platillo3);

        // Mostramos los registros por pantalla
        List<Platillo> platillos =  controladoraPersistencia.obtenerPlatillos();
        System.out.println("-----------Carta de platos--------------");
        for (Platillo platillo : platillos) {
            System.out.println(platillo);
            System.out.println("-----------------------");
        }




    }
}