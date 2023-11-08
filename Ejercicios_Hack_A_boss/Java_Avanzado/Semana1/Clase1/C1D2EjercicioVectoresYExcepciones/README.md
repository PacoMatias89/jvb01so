# Ejercicio Nº 3 - Vectores y excepciones - Individual
Este ejercicio básicamente lo que nos pide es que nos creemos una función en la cual 
le agregaremos por parámetros un vector y su respectiva posición, previamente a esto hemos tenido que agregar N número de datos 
en cierto vector, en mi caso lo he hecho fijo, ya que era una de las opciones que nos brindaba el ejercicio.

### Proyecto parte 1, 2 y 3
En esta parte del proyecto he usado la excepción estandar de Java en la cual nos dice si el indice está dentro o no del array:

<pre>
public class Main {
    public static void main(String[] args) {
        int[] vector = {1,2,3,4,5,6,7,8,9,10};
        validarPosicion(vector, 10);

    }
    public static void validarPosicion(int[] vector, int posicion)throws IndexOutOfBoundsException {

                int valor = vector[posicion];
                System.out.println("La posicion ingresada es: " + posicion + " y el valor es: " + valor);
                

    }
}
</pre>

Teniendo la siguiente salida:

>Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
at Main.validarPosicion(Main.java:27)
at Main.main(Main.java:22)

### Apartado 4
En este apartado ya lo que hacemos básicamente es crearnos una clase de excepción personalizada para la personalización de los errores.

<pre>
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


</pre>

Como podremos observar, hemos creado una clase personalizada para la creación del manejo de errores con un mensaje descriptivo. Así es más fácil de saber que es lo que está pasando por el código.
Siendo esta la salida
>Error del indice: El índice ingresado no existe en el vector.