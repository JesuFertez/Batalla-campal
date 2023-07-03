# Batalla-campal
Simil de Batalla Naval ambientado en las calles manifestantes de Chile.
- Desarrollado en Java
- Ejecución consola
- Ide Eclipse
### REQUERIMIENTO
Desarrolle un programa que realice lo siguiente:
Para efectos de simulación, el lugar de acción se simulará como una matriz compuesta de caracteres con 15 filas y 15 columnas, en los que se dispondrán de forma aleatoria:
3 Kromis, donde cada una utiliza tres celdas de la matriz y se ubican siempre de forma vertical. Cada celda ocupada por un vehículo de este tipo se define con una letra "K"
5 Caguanos, ubicados siempre horizontalmente en la matriz, definidos en ésta con una letra"C" y
haciendo uso de dos espacios.
10 Trupallas, los cuales se representan como una celda en la matriz con la letra ""
El programa debe situar de forma aleatoria la cantidad de vehículos antes indicados. Se recomienda hacerlo en el orden antes mencionado, pero no es obligación. Considere que cada tipo de vehículoocupará una determinada cantidad de celdas en la matriz, y que no pueden existir
vehículos encimade otros.
Por cada vehículo ingresado, entonces, se debe hacer lo siguiente:
El programa calcula una fila y columna de forma aleatoria (el número debe estar en el rango definido).
o Si está agregando una Kromi, debe escribir tres celdas hacia abajo contando desde la celda obtenida, si es un Caguano debe rellenar dos celdas hacia el lado (de izquierda a derecha) mientras que, si el vehículo a registrar es un Trupalla, se debe agregar en la coordenada obtenida ya que
solo usa una celda.
Antes de agregar un vehículo, se debe validar que no exista ningún otro en algunas de las posiciones que se considerara. De no ser así, se debe obtener nuevamente otro par de coordenadas de forma aleatoria hasta que sea posible ubicar el vehículo en cuestión sin inconvenientes.
Además, recuerde que todo vehículo debe quedar siempre situado dentro de la matriz, lo cual también se debe validar. Si las coordenadas obtenidas provocan que el vehículo nocumpla con esta condición, se debe solicitar otra fila y columna.

Los manifestantes, tienen un arsenal ilimitado de huevos, los que pueden lanzar libremente dentro del espacio considerado. Para representar esto, se debe solicitar al usuario que ingrese un número de fila y de columna, ambos válidos, y
verificar si en la matriz está ubicado un vehículo o no:
Si el proyectil da sobre una Kromi, se asignan tres puntos, si da sobre un Caguano, se asignan dos
puntos, y si da sobre un Trupalla se asigna un punto.
Si una Kromi ha sido inutilizada completamente, esto es, que sus tres celdas han sido atacadas por huevos, se asignan 10 puntos adicionales. Si se inutiliza un Caguano se asignan 7 puntos adicionales. Un Trupalla queda inutilizado automáticamente al recibir un huevo, portanto no
existe puntaje adicional por estos efectos.
- No hay una cantidad límite de huevos a lanzar, y un huevo puede caer más de una vez sobre una misma posición. Sin embargo, cada vez que una posición sea atacada por un huevo, el valor de la celda en la matriz original debe ser expresado como "H". Si la celda sobre la quese lanza un huevo ya había sido atacada previamente, no se debe asignar puntaje por este concepto.
- Finalmente, al terminar el programa se debe indicar el puntaje total obtenido por el usuario.
  
  ## PREVISUALIZACION

![PREVISUALIZACIÓN PROYECTO BATALLA CAMPAL ](screenshots/Tablero_1.png)

## AUTOR :
- María Jesús Fernández Cortez [@JesuFertez](https://github.com/JesuFertez)
