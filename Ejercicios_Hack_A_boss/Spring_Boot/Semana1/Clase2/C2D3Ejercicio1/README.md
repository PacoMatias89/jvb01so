# Ejercicio Nº 1: Conversor de unidades de longitud

Api para convertir unidades, en este caso se convertirá pasando los datos a convertir a metros a través de 
un GetMapping

```java

    @GetMapping("/convert")
    public String convert(@RequestParam double data ) {
        return data +"cm son: "+  (data / 100) +" m";
    }
```