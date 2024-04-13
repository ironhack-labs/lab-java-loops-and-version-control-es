
![logo_ironhack_blue 7](https://user-images.githubusercontent.com/23629340/40541063-a07a0a8a-601a-11e8-91b5-2f13e4e6b441.png)

# LAB | Java Bucles y Control de Versiones

## Introducción

Acabamos de aprender cómo iterar sobre arreglos de diferentes maneras de acuerdo a las necesidades, así que ahora practiquemos un poco.

<br>

## Requisitos

1. Haz un fork de este repositorio.
2. Clona este repositorio.
3. Añade a tu instructor y a los calificadores de la clase como colaboradores de tu repositorio. Si no estás seguro de quiénes son los calificadores de tu clase, pregunta a tu instructor o consulta la presentación del primer día.
4. En el repositorio, crea un proyecto de Java y añade el código para las siguientes tareas.

## Entrega

Una vez que termines la tarea, envía un enlace URL a tu repositorio o tu solicitud de extracción en el campo de abajo.

<br>

## Instrucciones

### Tarea 1

Escribe un método Java que devuelva la diferencia entre los valores más grande y más pequeño en un array de enteros. La longitud del array debe ser al menos 1.

### Tarea 2 

Escribe un método Java que encuentra los elementos más pequeños y segundos más pequeños de un array dado y los imprime en la consola.

### Tarea 3

Escribe un método Java que calcule el resultado de la siguiente expresión matemática, donde x y y son dos variables que ya han sido establecidas en tu código:

<br>

![img-1-formula](https://education-team-2020.s3-eu-west-1.amazonaws.com/java/img-1.png)

<br>

## FAQs (Preguntas frecuentes)

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">Estoy atascado y no sé cómo resolver el problema o por dónde empezar. ¿Qué debo hacer?</summary>

  <!-- ✅ -->

  Si estás atascado en tu código y no sabes cómo resolver el problema o por dónde empezar, debes dar un paso atrás y tratar de formular una pregunta clara y directa sobre el problema específico que enfrentas. El proceso que seguirás al tratar de definir esta pregunta te ayudará a limitar el problema y a encontrar soluciones potenciales.

  Por ejemplo, ¿estás enfrentando un problema porque no entiendes el concepto o estás recibiendo un mensaje de error que no sabes cómo arreglar? Por lo general, es útil intentar formular el problema de la manera más clara posible, incluyendo cualquier mensaje de error que estés recibiendo. Esto puede ayudarte a comunicar el problema a otras personas y, potencialmente, a obtener ayuda de tus compañeros o recursos en línea.

  Una vez que tengas una comprensión clara del problema, deberías poder comenzar a trabajar hacia la solución.

</details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">¿Cómo creo un proyecto Maven en IntelliJ?</summary>

  <!-- ✅ -->

  Para crear un proyecto Maven en IntelliJ, puedes seguir estos pasos:

   1. Abre IntelliJ IDEA y haz clic en el botón "Create New Project".
   2. En el diálogo "New Project", selecciona "Maven" como el sistema de compilación.
   3. Especifica el nombre del proyecto.
   4. En la sección "Project Location", especifica una ubicación donde quieres guardar tu proyecto.
   5. Selecciona la casilla de verificación "Create Git repository" para inicializar el repositorio git al crear el proyecto.
   6. Haz clic en el botón "Create" para crear el proyecto Maven.

</details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">¿Cuál es la importancia de usar el "MAX_VALUE" e "MIN_VALUE" Integer en Java y cómo se pueden usar en un programa?</summary>

  <!-- ✅ -->

  El `Integer.MAX_VALUE` y `Integer.MIN_VALUE` son constantes en la clase Java `Integer` que representan los valores más grandes y más pequeños que un tipo `int` puede tener, respectivamente.

  La importancia de usar estos valores es que proporcionan una forma clara y estándar de representar los valores máximos y mínimos de un tipo `int`, lo cual puede ser útil en diversas situaciones como:

  1. **Definir límites**: Puedes usar `Integer.MAX_VALUE` y `Integer.MIN_VALUE` para definir los límites superior e inferior de una variable int o un rango de valores.
  2. **Comparaciones**: Puedes usar estos valores para comparar un valor int con el valor más grande o más pequeño posible y tomar decisiones basadas en el resultado de la comparación.
  
  Aquí hay un ejemplo de cómo se pueden usar `Integer.MAX_VALUE` y `Integer.MIN_VALUE` en un programa:
  
  ```java
  int x = Integer.MAX_VALUE;
  int y = Integer.MIN_VALUE;

  System.out.println("The largest possible value of int is: " + x);
  
  System.out.println("The smallest possible value of int is: " + y);

  if (x > y) {
    System.out.println("x is larger than y");
  }
  ```

</details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">¿Qué es un bucle foreach y cómo puedo usarlo en Java?</summary>

  <!-- ✅ -->

  El bucle `foreach` es un tipo de bucle en Java que te permite iterar sobre elementos en una colección o array sin usar un índice explícito. La sintaxis para un bucle `foreach` es:

  ```java
  for (Type variable : collection) {
    // do something with each element
  }
  ```

  Donde `Type` es el tipo de elemento en la colección, `variable` es una variable temporal para mantener cada elemento y `collection` es la colección o array que se está iterando. El bucle `foreach` iterará sobre cada elemento en la colección desde el inicio hasta el final, ejecutando el bloque de código dentro del bucle para cada elemento.

  Ejemplo de uso:

  ```java
  int[] numbers = {1, 2, 3, 4, 5};
  for (int number : numbers) {
    System.out.println(number);
  }
  ```

  Esto producirá:

  ```bash
  1
  2
  3
  4
  5
  ```

</details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">No puedo enviar cambios a mi repositorio. ¿Qué debo hacer?</summary>

  <!-- ✅ -->

  Si no puedes enviar cambios a tu repositorio, aquí hay algunos pasos que puedes seguir:

  1. Verifica tu conexión a internet: Asegúrate de que tu conexión a internet sea estable y funcione.
  2. Verifica la URL de tu repositorio: Asegúrate de estar usando la URL correcta de tu repositorio para enviar tus cambios.
  3. Revisa tus credenciales de Git: Asegúrate de que tus credenciales de Git estén actualizadas y correctas. Puedes revisar tus credenciales usando el siguiente comando:

  ```bash
  git config --list
  ```

  4. Actualiza tu repositorio local: Antes de enviar cambios, asegúrate de que tu repositorio local esté actualizado con el repositorio remoto. Puedes actualizar tu repositorio local usando el siguiente comando:

  ```bash
  git fetch origin
  ```

  5. Revisa posibles conflictos: Si hay conflictos entre tu repositorio local y el repositorio remoto, resuélvelos antes de enviar cambios.
  6. Envía cambios: Una vez que hayas resuelto los conflictos y actualizado tu repositorio local, puedes intentar enviar cambios nuevamente usando el siguiente comando:

  ```bash
  git push origin <branch_name>
  ```

</details>