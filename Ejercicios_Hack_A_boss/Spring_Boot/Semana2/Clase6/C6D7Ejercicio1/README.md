# Ejercicio Nº 1: Patrón DTO

****
**La colección de POSTMAN se encuentra en la carpeta src/main/resource**

Un restaurante necesita una API que proporcione información detallada sobre las calorías de los platos de su menú.

Para esto, almacena en una base de datos lógica los siguientes datos:

Platos: codigo_plato, nombre, precio, lista_Ingredientes

Ingredientes: codigo_ingrediente, nombre, cantidad_calorias

La API debe recibir el nombre de un plato como parámetro y devolver en base a esto:

- La cantidad total de calorías del plato completo.
- Una lista de ingredientes que componen el plato, junto con la cantidad de calorías de cada uno (la sumatoria de estas calorías deberían de dar la cantidad total de calorías del plato).
- El ingrediente con la mayor cantidad de calorías en el plato.

### Notas Importantes

- Utilizar para las responses el patrón DTO.

- Como ayuda, el dueño del restaurante nos brindó dos archivos .json con datos tanto de los platos con los que cuenta en el menú, como la lista completa de ingredientes con los que trabaja para cada plato.

- Utilizar ambos archivos como base de datos lógica del sistema. Cargar los datos del json a la aplicación y almacenar los datos en collections.

### Devolución del GET

```json
{
  "plateCode": 1,
  "name": "Spaghetti a la bolognesa",
  "amountCalories": 5113.0,
  "maxCaloriesIngredient": {
    "ingredientCode": 9,
    "name": "Aceite de oliva",
    "amountCalories": 900
  },
  "ingredients": [
    {
      "ingredientCode": 1,
      "name": "Cebolla",
      "amountCalories": 47
    },
    {
      "ingredientCode": 2,
      "name": "Ajo",
      "amountCalories": 169
    },
    {
      "ingredientCode": 3,
      "name": "Pimiento",
      "amountCalories": 22
    },
    {
      "ingredientCode": 4,
      "name": "Tomate",
      "amountCalories": 22
    },
    {
      "ingredientCode": 5,
      "name": "Pollo",
      "amountCalories": 165
    },
    {
      "ingredientCode": 6,
      "name": "Carne de res",
      "amountCalories": 250
    },
    {
      "ingredientCode": 7,
      "name": "Pasta",
      "amountCalories": 131
    },
    {
      "ingredientCode": 8,
      "name": "Arroz",
      "amountCalories": 130
    },
    {
      "ingredientCode": 9,
      "name": "Aceite de oliva",
      "amountCalories": 900
    },
    {
      "ingredientCode": 10,
      "name": "Mantequilla",
      "amountCalories": 752
    },
    {
      "ingredientCode": 11,
      "name": "Huevo",
      "amountCalories": 70
    },
    {
      "ingredientCode": 12,
      "name": "Leche",
      "amountCalories": 42
    },
    {
      "ingredientCode": 13,
      "name": "Queso",
      "amountCalories": 402
    },
    {
      "ingredientCode": 14,
      "name": "Harina",
      "amountCalories": 364
    },
    {
      "ingredientCode": 15,
      "name": "Lechuga",
      "amountCalories": 15
    },
    {
      "ingredientCode": 16,
      "name": "Espinaca",
      "amountCalories": 23
    },
    {
      "ingredientCode": 17,
      "name": "Zanahoria",
      "amountCalories": 41
    },
    {
      "ingredientCode": 18,
      "name": "Patata",
      "amountCalories": 77
    },
    {
      "ingredientCode": 19,
      "name": "Maíz",
      "amountCalories": 86
    },
    {
      "ingredientCode": 20,
      "name": "Cilantro",
      "amountCalories": 23
    },
    {
      "ingredientCode": 21,
      "name": "Perejil",
      "amountCalories": 47
    },
    {
      "ingredientCode": 22,
      "name": "Albahaca",
      "amountCalories": 22
    },
    {
      "ingredientCode": 23,
      "name": "Orégano",
      "amountCalories": 306
    },
    {
      "ingredientCode": 24,
      "name": "Canela",
      "amountCalories": 261
    },
    {
      "ingredientCode": 25,
      "name": "Pimienta",
      "amountCalories": 251
    },
    {
      "ingredientCode": 26,
      "name": "Sal",
      "amountCalories": 0
    },
    {
      "ingredientCode": 27,
      "name": "Azúcar",
      "amountCalories": 387
    },
    {
      "ingredientCode": 28,
      "name": "Vinagre",
      "amountCalories": 18
    },
    {
      "ingredientCode": 29,
      "name": "Salsa de soja",
      "amountCalories": 61
    },
    {
      "ingredientCode": 30,
      "name": "Limón",
      "amountCalories": 29
    }
  ]
}
```