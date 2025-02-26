# isa2025-healthcalc
Health calculator used in Ingeniería del Software Avanzada

## Casos de prueba

Se han identificado los siguientes casos de prueba para la clase HealthCalc.java:

### Método idealWeight()

- Altura no válida: el método debería lanzar una excepción (de forma arbitraria, se consideran no válidos valores de altura menores a 80 cm y mayores a 210 cm). Este caso de prueba se implementa con cuatro tests diferentes: altura negativa, altura igual a 0, altura positiva pero demasiado pequeña, y altura positiva pero demasiado grande.
- Género no válido: el método debería lanzar una excepción (se considera género no válido cuando el caracter es distinto a `m` o a `w`). Este caso de prueba se implementa con un único test.
- Funcionamiemto correcto: el método debería devolver el valor esperado según la fórmula cuando ambos parámetros son correctos (es decir, cuando no es ningún caso de los anteriormente mencionados). Este caso de prueba se implementa con dos tests por separado: uno para `genero` == `m` con valor de altura válido y otro para genero `genero` == `w` con valor de altura válido.

En total se han realizado 7 tests para este método.

### Método basalMetabolicRate()

- Altura no válida: el método debería lanzar una excepción (de forma arbitraria, se consideran no válidos valores de altura menores a 80 cm y mayores a 210 cm). Este caso de prueba se implementa con cuatro tests diferentes: altura negativa, altura igual a 0, altura positiva pero demasiado pequeña, y altura positiva pero demasiado grande.
- Género no válido: el método debería lanzar una excepción (se considera género no válido cuando el caracter es distinto a `m` o a `w`). Este caso de prueba se implementa con un único test.
- Peso no válido: el método debería lanzar una excepción (de forma arbitraria, se consideran no válidos valores de altura menores o iguales a 0 kg y mayores a 200 kg). Este caso de prueba se implementa con tres tests diferentes: peso negativo, peso igual a 0, y peso positivo pero demasiado grande.
- Edad no válida: el método debería lanzar una excepción (de forma arbitraria, se consideran no válidos valores de edad menores o iguales a 0 años y mayores a 105 kg). Este caso de prueba se implementa con tres tests diferentes: edad negativa, edad igual a 0, y edad positiva pero demasiado grande.
- Funcionamiemto correcto: el método debería devolver el valor esperado según la fórmula cuando ambos parámetros son correctos (es decir, cuando no es ningún caso de los anteriormente mencionados). Este caso de prueba se implementa con dos tests por separado: uno para `genero` == `m` con el resto de los parámetros válidos y otro para genero `genero` == `w` con el resto de los parámetros válidos.

En total se han realizado 13 tests para este método.