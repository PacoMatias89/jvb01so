/**
 *Ejercicio Nº 3 - Vectores y excepciones - Individual
 *
 * Estás desarrollando una aplicación de gestión de datos en la que puedes almacenar información en un vector y acceder a ella posteriormente. Tu tarea es implementar una función que te permita almacenar datos en un vector y manejar excepciones estándar de Java teniendo en cuenta lo siguiente:
 *
 * Desarrolla una función que te permita almacenar datos en un vector. Puedes utilizar un vector de tamaño fijo para simplificar el ejercicio.
 *
 * Luego, implementa un mecanismo que te permita acceder a los datos almacenados en el vector proporcionando un índice.
 *
 * Utiliza una excepción estándar de Java que, al intentar acceder a una posición que no existe en el vector, por ejemplo, un índice que esté fuera del rango del vector se pueda capturar.
 *
 * Captura la excepción y proporciona un mensaje de error descriptivo que indique que estás intentando acceder a una posición inválida en el vector.
 *
 *
 *
 * **/


public class Main {
    public static void main(String[] args) throws IndiceInvalidoException {
        int[] vector = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        validarPosicion(vector, 12);
    }


    public static void validarPosicion(int[] vector, int posicion) throws IndiceInvalidoException , IndiceInvalidoException {

        try {
            if (posicion < 0 || posicion >= vector.length) {
                throw new IndiceInvalidoException("El índice ingresado no existe en el vector.");
            }else {
                int valor = vector[posicion];
                System.out.println("La posicion ingresada es: " + posicion + " y el valor es: " + valor);


            }
        }catch (IndiceInvalidoException e) {
            System.err.println("Error del indice: " + e.getMessage());
        }

    }
}

