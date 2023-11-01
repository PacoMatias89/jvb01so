# Ejercicio N.º 2 - Herencia y polimorfismo - Individual

## Enunciado
Crear una clase llamada Vestimenta con los atributos: código, nombre, precio, marca, talla y color (con sus métodos y constructores correspondientes).

1. a) Crear las siguientes clases hijas que compartan sus atributos y métodos:
   + Zapato: material, tipoCierre
   + Pantalon: estilo, tipoTejido
   + Camiseta: manga, cuello
   + Sombrero: tipo, tamaño
2. Una vez creadas las clases, crear en el Main un vector de tipo Vestimenta y almacenar 3 zapatos, 3 pantalones, 2 camisetas y 1 sombrero (crear un objeto con parámetros para cada uno de ellos).
3. Crear los siguientes métodos (en cada subclase correspondiente):
   + Zapato: método para mostrar un mensaje en pantalla que diga "Estos zapatos son de marca: "(mostrar marca).
   + Pantalon: método para mostrar un mensaje en pantalla que diga "Estos pantalones son de marca: "(mostrar estilo).
   + Camiseta: método para mostrar un mensaje en pantalla que diga "Esta camiseta es de marca: "(mostrar manga).
   + Sombrero: método para mostrar un mensaje en pantalla que diga "Este sombrero es de marca: "(mostrar tipo).
4. Recorrer el vector y ejecutar el método que corresponde en cada posición del mismo.

### Pista
**Todos tendrán el mismo método, con el mismo nombre, pero únicamente cambia el mensaje que muestran. 
Tener en cuenta para esto la implementación de herencia y sobrescritura de métodos.**

### Creación del ejercicio
Lo primero que tenemos que crear como bien nos dice en el enunciado, es la creación de la clase Vestimenta, la cual va a tendrá dos métodos
#### Primer método (getMarca)
``
public String getMarcar() {
return marcar;
}
``

Este método nos hará falta para la marca de la clase Zapato

#### Segundo método
``
public String mensaje(){
return "Vestimenta de marca" + marcar +" genérica";
}
``

Este otro método es el que vamos a sobreescribir en las demás clases, pero cada clase tendrá una personalización propia, ya que 
el método que aparece ahí es meramente orientativo.

##### Personalización del método mensaje()

+ Clase Zapato:
<pre>
 @Override
  public String mensaje() {
    return "Estos zapatos son de marca: " + getMarcar();
  }
</pre>

+ Clase Sombrero:
<pre>
 @Override
  public String mensaje() {
    return "Este sombrero es de tipo: " + tipo;
  }
</pre>

+ Clase Camiseta:
<pre>
@Override
public String mensaje() {
    return "Esta camiseta es de manga: " + manga;
}
</pre>


+ Clase Pantalón:
<pre>
@Override  
public String mensaje() {  
    return "Estos pantalones son de estilo:" + estilo;<br>
}
</pre>




Por último lo que hacemos es crearnos un array de tipo **Vestimenta** y le vamos agregando los tipos de prenda que hemos creado,
mostrando así con un foreach todos los mensajes anteriormente mostrado, quedando la salida por pantalla de la siguiente manera:

>>Estos zapatos son de marca: Nike  
Estos zapatos son de marca: Adidas  
Estos zapatos son de marca: Reebok  
Estos pantalones son de estilo: Vaquero  
Estos pantalones son de estilo: Sport  
Estos pantalones son de estilo: Chandal  
Este sombrero es de tipo: Cuero tratado
