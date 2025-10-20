# Ejercicios Opcionales

### 000 Recursividad - Billetes y Monedas

Escribir un programa descompuesto convenientemente en base a funciones que, para una suma de dinero
dada, indique cómo descomponerla en billetes y monedas corrientes. Se debe utilizar el mínimo posible de billetes y
monedas. No existen limitaciones respecto al número de billetes y monedas disponibles.



### 001 Sistema de Gestión de Inventario

Escribe un método que reciba un mapa (Map) que represente el inventario de productos.
Las claves del mapa serán los nombres de los productos (String),
y los valores serán arreglos de tipo double[] con dos elementos:
El primer elemento representa la cantidad disponible.
El segundo elemento representa el precio unitario del producto.

El método debe devolver una lista de tuplas (pares) que contenga
el nombre del producto y el valor total de su inventario
(cantidad * precio_unitario), ordenados de mayor a menor
según dicho valor total.*
Ejemplo:
``` Java 
Entrada:
Map<String, double[]> inventario = Map.of(
"manzanas", new double[]{50, 0.5},
"naranjas", new double[]{30, 0.8},
"plátanos", new double[]{20, 0.6},
"uvas", new double[]{10, 1.2}
);*
Salida esperada:
[(manzanas, 25.0), (naranjas, 24.0), (plátanos, 12.0), (uvas, 12.0)]*/
```
### 002 Dar la campanada
Crear un programa que lea del teclado dos valores que indican hora de comienzo y hora de fin (ej: 16:30
y 19:17), y presente por pantalla la cantidad de veces que un reloj emite campanadas (las campanas se producen en los
minutos: 0, 15, 30 y 45). Se supone que la hora de comienzo es menor que la hora de final y ambas pertenecen al mismo
día.
Por ejemplo, si la hora de comienzo es 9:44 y la hora de fin es 10:01, hay que informar de 2 campanadas.
Si la hora de comienzo es 8:00 y la hora de fin es 10:07, el programa debe indicar que sonaron 8 campanadas.

### 003 Comparación de vocabularios con conjuntos
Dadas dos cadenas de texto, escribe una función que devuelva:
Las palabras únicas de cada texto.
Las palabras en común entre ambos textos.
Todas las palabras ordenadas alfabéticamente (sin duplicados).
Usa set() y sorted() para resolverlo.

### 004 Gestionar la clase
Implementar un programa para gestión de una clase sin suponer ningún número de alumnos máximo. Para ello se utilizará una lista.

Para cada alumno se almacenará la siguiente información: Nombre, Apellidos, DNI, Nota en número, y Nota en letra.  Crea la clase Alumno.
Implementa la clase Curso cuyo atributo es una lista de tipo Alumno.

El programa permitirá las siguientes operaciones, en un menú de opciones:

•    Añadir nuevo alumno.
•    Borrar alumno ya existente (dando su posición en la lista y/o su nombre, como se prefiera).
•    Cambiar algún dato de algún alumno: Modificar sus notas...
•    Mostrar todos los datos de todos los alumnos (uno a uno, por ejemplo).
•    Cambiar la nota en letra de cada alumno según su nota numérica: No presentado (<0), Suspenso (<5), Aprobado (<7), Notable (<9), Sobresaliente (<10) y Matrícula de Honor (10).
•    Mostrar el total de alumnos de cada nota (Suspenso, Aprobado...) y el porcentaje que suponen respecto al total de alumnos en la lista y respecto al total de alumnos presentados (excluyendo los No Presentados).