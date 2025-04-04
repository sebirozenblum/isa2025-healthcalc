# Health Calculator
Proyecto de la asignatura Ingeniería del Software Avanzada. Se irá desarrollando la calculadora de salud a lo largo de las distintas prácticas.

## **Práctica 1: testing**

En esta práctica se desarrolla la clase principal de la calculadora, `HealthCalc.java`, así como los correspondientes tests, definidos en la clase `HealthCalcTest.java`. La clase `HealthCalc.java` consta de dos métodos, `idealWeight()` y `basalMetabolicRate()`. A continuación se presentan los casos de prueba para cada uno de ellos:

<details>

<summary> Método <b> idealWeight() </b> </summary>

Se han identificado los siguientes casos de prueba:

- Altura no válida: el método debería lanzar una excepción (de forma arbitraria, se consideran no válidos valores de altura menores a 80 cm y mayores a 210 cm). Este caso de prueba se implementa con cuatro tests diferentes: altura negativa, altura igual a 0, altura positiva pero demasiado pequeña, y altura positiva pero demasiado grande.
- Género no válido: el método debería lanzar una excepción (se considera género no válido cuando el caracter es distinto a `m` o a `w`). Este caso de prueba se implementa con un único test.
- Funcionamiento correcto: el método debería devolver el valor esperado según la fórmula cuando ambos parámetros son correctos (es decir, cuando no es ningún caso de los anteriormente mencionados). Este caso de prueba se implementa con dos tests por separado: uno para `genero` == `m` con valor de altura válido y otro para genero `genero` == `w` con valor de altura válido.

En total se han realizado 7 tests para este método.

</details>

<details>
<summary>  Método <b>basalMetabolicRate()</b> </summary>

Se han identificado los siguientes casos de prueba:

- Altura no válida: el método debería lanzar una excepción (de forma arbitraria, se consideran no válidos valores de altura menores a 80 cm y mayores a 210 cm). Este caso de prueba se implementa con cuatro tests diferentes: altura negativa, altura igual a 0, altura positiva pero demasiado pequeña, y altura positiva pero demasiado grande.
- Género no válido: el método debería lanzar una excepción (se considera género no válido cuando el caracter es distinto a `m` o a `w`). Este caso de prueba se implementa con un único test.
- Peso no válido: el método debería lanzar una excepción (de forma arbitraria, se consideran no válidos valores de altura menores o iguales a 0 kg y mayores a 200 kg). Este caso de prueba se implementa con tres tests diferentes: peso negativo, peso igual a 0, y peso positivo pero demasiado grande.
- Edad no válida: el método debería lanzar una excepción (de forma arbitraria, se consideran no válidos valores de edad menores o iguales a 0 años y mayores a 105 años). Este caso de prueba se implementa con tres tests diferentes: edad negativa, edad igual a 0, y edad positiva pero demasiado grande.
- Funcionamiemto correcto: el método debería devolver el valor esperado según la fórmula cuando ambos parámetros son correctos (es decir, cuando no es ningún caso de los anteriormente mencionados). Este caso de prueba se implementa con dos tests por separado: uno para `genero` == `m` con el resto de los parámetros válidos y otro para genero `genero` == `w` con el resto de los parámetros válidos.

En total se han realizado 13 tests para este método.

</details>

<details>
<summary>  Ejecución de los tests </summary>

Luego de ejecutar los 20 tests mediante JUnit (13 para el primer método y 7 para el segundo), se obtienen los siguientes resultados:

![alt text](docs/test_results.png)

Se puede ver que todos los tests fueron ejecutados con éxito. Por lo tanto, la clase está correctamente implementada.

</details>


___

## **Práctica 2: casos de uso**

En esta práctica se realiza un diagrama de casos de uso para la calculadora, siguiendo la notación UML. Este diagrama tiene como objetivo representar de manera visual las interacciones entre los usuarios y el sistema, identificando las distintas funcionalidades de la calculadora.
Se lleva a cabo un diagrama simple, con dos casos de uso. Luego, se amplía el diagrama con dos casos de uso más. Por último, se detalla la especificación de uno de ellos.

<details>
<summary>  Diagrama simple </summary>

En este diagrama (HealthCalc_UseCaseDiagram_1.png) se representan los casos de uso que fueron implementados en la Práctica 1: calcular el Ideal Weight y el Basal Metabolic Rate.

![alt text](docs/HealthCalc_UseCaseDiagram_1.png)

</details>

<details>
<summary>  Diagrama ampliado </summary>

En este diagrama (HealthCalc_UseCaseDiagram_2.png) se añaden dos casos de uso adicionales: calcular el índice de masa corporal (BMI) y configurar el sistema de unidades de la calculadora.

![alt text](docs/HealthCalc_UseCaseDiagram_2.png)

</details>

<details>
<summary>  Especificación del caso de uso </summary>

Se especifica el caso de uso para configurar el sistema de unidades de la calculadora (UseCase.txt):

```
Nombre: Configuración del sistema de unidades
Actor principal: usuario
Nivel: user goal
Stakeholders: 
- Usuario: es quien ejecuta y se beneficia del caso de uso
- Equipo de desarrollo: es quien debe permitir que el caso de uso pueda llevarse a cabo
Scope: la calculadora de salud (Health Calculator)
Descripción: Caso de uso que permite al usuario seleccionar el sistema de unidades utilizado en la calculadora (internacional o imperial).

Precondiciones:
- El usuario tiene acceso al sistema y lo puede utilizar correctamente.

Garantía mínima:
- Se mantiene vigente el sistema de unidades previamente establecido, sin alterar el funcionamiento de la calculadora.

Garantía de éxito:
- El sistema actualiza correctamente la opción elegida y muestra un mensaje de confirmación indicando que la configuración ha sido actualizada con éxito.

Escenario principal:
	1.	El usuario accede a la configuración del sistema.
	2.	Dentro de las opciones disponibles, selecciona “Sistema de Unidades”.
	3.	El sistema muestra dos opciones:
	•	Sistema Internacional (kg, cm)
	•	Sistema Imperial (lb, in)
	4.	El usuario elige el sistema de unidades que desea utilizar.
	5.	El sistema guarda la selección y actualiza las mediciones y cálculos para reflejar el sistema de unidades elegido.
	6.	Se muestra un mensaje de confirmación indicando que la configuración ha sido actualizada con éxito.

Escenario alternativo:

4a. El usuario no realiza ninguna selección y decide salir de la configuración:
	•	4a.1. El sistema mantiene la configuración previa sin realizar cambios.

Postcondiciones:
- El sistema almacena la configuración seleccionada por el usuario.
- Todas las mediciones y cálculos en el sistema reflejan el sistema de unidades elegido.
```

</details>

___

## **Práctica 3: BDD**

En esta práctica se llevan a cabo tests para la clase `HealthCalcImp.java` siguiendo una metodología Behaviour-Driven Development (BDD).
Específicamente, se utilizan las herramientas Gherkin y Cucumber para definir e implementar los escenarios de prueba de forma clara y estructurada.
Las historias de usuario propuestas se corresponden con los dos métodos principales de la clase: `idealWeight()` y `basalMetabolicRate()`.

<details>
<summary> User story: ideal weight </summary>

```
As a user
I want to calculate my ideal weight
So that I can have a healthy life
```

</details>

<details>
<summary> User story: basal metabolic rate </summary>

```
As a user
I want to calculate my basal metabolic rate
So that I can know more about my metabolism
```

</details>

<details>
<summary> Testing </summary>

Para llevar a cabo los tests, se genera un fichero `.feature` por cada historia de usuario.
Dentro de ellos, se definen los escenarios de prueba. Por ejemplo:

```
  Scenario Outline: Calculando el ideal weight con altura negativa
    Given tengo una calculadora de salud
    When calculo el ideal weight con altura negativa <altura>
    Then el sistema lanza una Exception

    Examples:
      | altura |
      | -1     |
      | -5     |
      | -120   |
```

En total, se reportan 20 escenarios (que son los mismos que en la Práctica 1), los cuales son desarrollados utilizando Cucumber y ejecutados mediante JUnit.
Todos los tests fueron ejecutados con éxito, y los resultados pueden encontrarse en el fichero `output_tests.txt`.

</details>

___

## **Práctica 4: GUI**

En esta práctica se implementa una interfaz gráfica de usuario (GUI)
para la calculadora de salud, siguiendo un patrón MVC (modelo-vista-controlador).
En primer lugar, se propone un boceto utilizando la herramienta Balsamiq. Luego, se
desarrolla la interfaz en Java (utilizando la librería Swing), de forma que el resultado final sea lo más fiel posible al boceto inicial.
El diseño elegido para la interfaz permite al usuario interactuar de forma clara con los dos casos de uso principales
de la calculadora: calcular tanto el `idealWeight()` como el `basalMetabolicRate()`.


<details>
<summary> Boceto inicial </summary>

![alt text](docs/HealthCalcGUI_Mockup.png)

</details>

<details>
<summary> Implementación </summary>

![alt text](docs/HealthCalcGUI_screenshot_IW.png)
![alt text](docs/HealthCalcGUI_screenshot_BMR.png)

</details>

<details>
<summary> Calculadora en funcionamiento </summary>

La calculadora puede verse en funcionamiento al ejecutar el fichero `project-healthcalc.jar`
que se encuentra en la carpeta principal del proyecto.

</details>