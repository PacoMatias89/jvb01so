/**
 * Crear una clase llamada Electrodomestico (sin tilde, recuerda que los nombres de clases y variables no llevan tilde) con los siguientes atributos: cod, marca, modelo, consumo y color.
 * Luego, realiza las siguientes acciones:
 * a) Crea 3 objetos de la clase Electrodomestico utilizando parámetros.
 * b) Crea 1 objeto de la clase Electrodomestico sin parámetros.
 * c) Muestra por pantalla la marca, modelo y consumo energético de los 3 electrodomésticos creados con parámetros.
 * d) Intenta obtener la marca del electrodoméstico creado sin parámetros. ¿Se obtiene algún valor? De ser así… ¿Qué valor se obtiene?
 * */


public class Main {
    public static void main(String[] args) {

        //Apartado A)
        Electrodomestico e1 = new Electrodomestico(1, "Samsung", "TR50", "B", "negro");
        Electrodomestico e2 = new Electrodomestico(2, "BRAUN", "BTRE45", "C", "blanca");
        Electrodomestico e3 = new Electrodomestico(3, "FAGOR", "F435", "A", "negro");

        //Apartado B)
        Electrodomestico e4 = new Electrodomestico();

        //Apartado C)
        Electrodomestico[] electrodomesticos = {e1, e2, e3};
        for (Electrodomestico e : electrodomesticos) {
            System.out.println("-----Datos----");
            System.out.println("Marca: " +e.getMarca());
            System.out.println("Modelo: " +e.getModelo());
            System.out.println("Consumo energético: " +e.getConsumo());
            System.out.println();

        }


        //Apartado D)

        System.out.println("Marca: " +e4.getMarca());



    }
}