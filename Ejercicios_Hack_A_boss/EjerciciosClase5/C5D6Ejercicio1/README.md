# Ejercicio N.º 1 - Herencia, Polimorfismo y encapsulamiento - Individual

## Enunciado de la tarea
Crear una clase "Animal" con los atributos: id, nombre, edad, tipo de piel y tipo de alimentación (con sus métodos y constructores correspondientes). Agregar también un método llamado saludar que emita un mensaje por pantalla que diga “Hola, soy un animal”. A partir de esto hacer lo siguientes pasos:
1.  Crear sus clases hijas que compartan sus atributos y métodos:
    + "Mamífero" con atributos adicionales: número de patas, tipo de reproducción, color de pelaje, hábitat.
    + "Ave" con atributos adicionales: envergadura de alas, tipo de vuelo, color de plumaje, tipo de pico.
    + "Reptil" con atributos adicionales: longitud, tipo de escamas, tipo de veneno, hábitat.
2. Una vez creadas las clases, crear los siguientes métodos:
    + "Mamífero": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un mamífero".
    + "Ave": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un ave".
    + "Reptil": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un reptil".
3. En el método "main", crear un objeto de cada clase hija. Llamar a los 3 métodos saludar desde cada objeto.
4. Crear un objeto de tipo animal e intentar asignarle al Mamifero creado… ¿Qué sucede? ¿Es posible hacer esto? ¿Se aplica alguna propiedad para esto?
5. Cambiar el modificador de acceso de los métodos de "public" a "private". Intentar acceder desde el "main" a estos métodos. ¿Qué sucede? ¿Es posible hacer esto?

## Creación de la tarea
Lo primero que hacemos es crearnos la clase _Animal_, la cual nos va a servir de plantilla y/o base para la creación e implementación de ciertos métodos
que tendrán en común las otras 3 clases:

+ Reptil
+ Mamífero
+ Ave

Este método que tienen en común es el método _saludar()_ el cual lo sobreescribiremos en estas tres clases anteriormente citas.
Para poder sobreescribir un método en las clases en mi caso que estoy usando Intellij, dentro de donde estoy codificando le doy botón 
derecho y sigo la siguiente ruta: _Generata/ Overrider method_, y ya se nos abrirá una pequeña ventana y buscamos el método _saludar_.
Una vez lo tengamos sobreescrito en nuestras clases, ya podremos manipularlo a nuestro antojo, es decir, este método aún sobreescribiéndolo
ahora es un método independiente de la clase en la que está sobreescrito y podemos agregar lo que queramos en él.

### Apartado 4
Si podemos crear un objeto o una variable de tipo Animal y asignarle el mamífero creado, ya que la clase Mamífero es un animal y extiende de la misma, 
y de igual forma pasa con Reptil y Ave.

` Animal animal = mamifero;`

```
public class Mamifero extends Animal {

    private int numPatas;
    private String tipoReproduccion;
    private String colorPelo;
    private String habitat;
        /**********************************APARTADO A **********************************/
    public Mamifero(int id,
                    String nombre,
                    int edad,
                    String tipoPiel,
                    String tipoAlimentacion,
                    int numPatas, String tipoReproduccion,
                    String colorPelo, String habitat) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.numPatas = numPatas;
        this.tipoReproduccion = tipoReproduccion;
        this.colorPelo = colorPelo;
        this.habitat = habitat;
    }

    /**********************************APARTADO B**********************************/

    @Override
    public String saludar() {
        return "Hola, soy un mamífero..";
    }
}
```
### Apartado 5
En este caso que nos pide que cambiemos el acceso de public a private e intentar acceder desde nuestra clase _Main_ a esos métodos la respuesta es muy clara y 
contundente, puedes crearte los métodos con acceso private, pero **No** puedes acceder a ellos desde **Ninguna** otra clase, ya que son específicos de esa clase
en nuestro caso, de la clase _Animal_. 
Lo que sucede cuando intentamos acceder a este método es básicamente que el IDE no lo puede mostrar, porque como ya he comentando en el párrafo de arriba es **Exclusivo**  de esa clase.

**En el caso del ejercicio lo he dejado correctamente para que cuando se descargue el proyecto funcione correctamente, ya que si no como he comentado anteriormente daría error.**