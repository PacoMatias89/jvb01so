# Ejercicio Nº 1: Venta de autos

****
**La colección de POSTMAN se encuentra en la carpeta src/main/resource**

Una concesionaria de automóviles desea realizar un API REST que le permita realizar la carga de determinados autos usados. Para ello, necesitamos desarrollar los siguientes endpoints:

### Endpoints

1. **api/vehicles/**

    - **Método:** POST
    - **Descripción:** Agrega un nuevo automóvil.

2. **api/vehicles/**

    - **Método:** GET
    - **Descripción:** Retorna un listado de todos los autos seleccionados.

3. **api/vehicles/prices**

    - **Método:** GET
    - **Descripción:** Muestra el listado de los vehículos según los precios (de menor a mayor).

4. **api/vehicles/{id}**

    - **Método:** GET
    - **Descripción:** Muestra toda la información de un auto en particular.

### Notas Importantes

- Dado que el dueño de la concesionaria es un cliente muy exigente, se sugiere realizar buenas prácticas de programación, como la separación del proyecto según la Arquitectura Multicapas.

- Tener en cuenta que, por el momento, al no estar trabajando con bases de datos, podemos implementar collections (listas, arraylists, etc.) para manejar los CRUD de manera lógica. Recordar que, en base a lo último aprendido, los datos deben ser cargados desde la capa REPOSITORY.


### Get de todos los vehículos

```json
[
    {
        "id": 1,
        "brand": "Peugeot",
        "model": "206",
        "kilometers": 150000,
        "doors": 5,
        "price": 7500.0
    },
    {
        "id": 2,
        "brand": "Toyota",
        "model": "Camry",
        "kilometers": 80000,
        "doors": 5,
        "price": 12000.0
    },
    {
        "id": 3,
        "brand": "Ford",
        "model": "Focus",
        "kilometers": 60000,
        "doors": 5,
        "price": 10000.0
    },
    {
        "id": 4,
        "brand": "Honda",
        "model": "Civic",
        "kilometers": 70000,
        "doors": 5,
        "price": 11000.0
    },
    {
        "id": 5,
        "brand": "Chevrolet",
        "model": "Malibu",
        "kilometers": 90000,
        "doors": 5,
        "price": 13000.0
    },
    {
        "id": 6,
        "brand": "Nissan",
        "model": "Altima",
        "kilometers": 75000,
        "doors": 5,
        "price": 11500.0
    }
]
```