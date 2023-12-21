# Creación de una API para la Gestión de Estudiantes y Calificaciones

****
**La colección de POSTMAN se encuentra en la carpeta src/main/resource**

Se requiere desarrollar una API para gestionar los datos de estudiantes de una universidad, proporcionando una lista ordenada según su rendimiento académico en la materia "Programación I" (calculado en forma de promedio). La implementación debe seguir una arquitectura de múltiples capas, destacando la capa service para procesar y analizar los datos de los estudiantes.

## Datos de Estudiantes

De cada estudiante se solicitan los siguientes datos: num_matricula, nombre, apellido, fecha de nacimiento.

Para las calificaciones se necesita una clase Calificacion, la cual almacena las 3 calificaciones que obtuvo cada estudiante en los exámenes de la materia “Programación I” y su promedio. Tener en cuenta que cada estudiante tiene uno y solo un registro de calificaciones asociado.

En la clase calificación se debe guardar: id, calificacion1, calificacion2, calificacion3, promedio, Alumno un Alumno.

## Endpoints

### 1. GET /estudiantes

Devuelve una lista de todos los estudiantes sin un orden particular.

### 2. GET /calificaciones/{num_matricula}

Devuelve las calificaciones de un determinado estudiante.

### 3. GET /calificaciones/ordendesc

Devuelve las calificaciones de todos los estudiantes, junto con el nombre de cada uno de ellos ordenados de forma descendente (mayor calificación primero, menor a lo último).

## Notas Importantes

- Enfocarse en la lógica de negocio para evaluar el rendimiento académico, pudiendo involucrar la capa model para representar los datos de los estudiantes.

- En la capa controller deberán existir los endpoints mencionados.

- Utilizar el patrón DTO si ya lo conoces.

## Todos los alumnos

```json
[
    {
        "numRegistration": 1,
        "name": "John",
        "lastName": "Doe",
        "birthDate": "1990-01-02"
    },
    {
        "numRegistration": 2,
        "name": "Jane",
        "lastName": "Doe",
        "birthDate": "1989-12-24"
    },
    {
        "numRegistration": 3,
        "name": "Peter",
        "lastName": "Griffin",
        "birthDate": "1999-10-15"
    },
    {
        "numRegistration": 4,
        "name": "Bart",
        "lastName": "Simpson",
        "birthDate": "1999-10-15"
    }
]
```