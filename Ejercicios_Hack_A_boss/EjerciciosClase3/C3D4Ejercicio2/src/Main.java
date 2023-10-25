public class Main {
    public static void main(String[] args) {
        /*********************************APARTADO A*********************************************/

        Persona[] personas = new Persona[5];

        personas[0] = new Persona(1, "Juan", 25,"Calle alegría", "123456789");
        personas[1] = new Persona(2, "María", 34,"Calle Cactus", "258147369");
        personas[2] = new Persona(3, "Pedro", 19,"Calle esquina", "741852963");
        personas[3] = new Persona(4, "Lucía", 45,"Calle sol", "789456123");
        personas[4] = new Persona(5, "Hugo", 28,"Calle luna", "582471693");

        /*********************************APARTADO B*********************************************/

        for (int i = 0; i < personas.length; i++) {
           System.out.println("------Datos de la persona " + (i+1) + "------");
           System.out.println("Nombre: " +personas[i].getNombre());
           System.out.println("Edad: " +personas[i].getEdad());
           System.out.println();
       }

       /*********************************APARTADO C*********************************************/
        System.out.println("-----Dato de la persona antes de ser cambiados -----");
        System.out.println("Nombre del usuario " + personas[0].getId() +" es: " +personas[0].getNombre() );
        System.out.println("Nombre del usuario " + personas[4].getId() +" es: " +personas[4].getNombre() );

        System.out.println();

        System.out.println("-----Dato de la persona después de ser cambiados -----");
        personas[0].setNombre("Francisco Matías");
        personas[4].setNombre("Miguel Ángel");
        System.out.println("Nombre del usuario " + personas[0].getId() +" es: " +personas[0].getNombre() );
        System.out.println("Nombre del usuario " + personas[4].getId() +" es: " +personas[4].getNombre() );
        System.out.println();

        /*********************************APARTADO D*********************************************/

        System.out.println("-----Personas mayores de 30-----");
        System.out.println();
        for (int i = 0; i < personas.length; i++) {

            if (personas[i].getEdad() > 30) {
                System.out.println("------Datos de la persona " + (i+1) + "------");
                System.out.println("Nombre: " +personas[i].getNombre());
                System.out.println("Edad: " +personas[i].getEdad());
                System.out.println();
            }

        }


    }
}