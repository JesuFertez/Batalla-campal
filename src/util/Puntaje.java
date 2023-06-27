package util;

/*
 *  los que pueden lanzar libremente dentro del espacio considerado. Para representar esto, se debe solicitar
 *   al usuario que ingrese un número de fila y de columna, ambos válidos, y verificar si en la matriz está ubicado
 *    un vehículo o no:
Si el proyectil da sobre una Kromi, se asignan tres puntos, si da sobre un Caguano se asignan dos
puntos, y si da sobre un Trupalla se asigna un punto.
Si una Kromi ha sido inutilizada completamente, esto es, que sus tres celdas han sido atacadas por huevos,
 se asignan 10 puntos adicionales. Si se inutiliza un Caguano se asignan 7 puntos adicionales. Un Trupalla queda 
 inutilizado automáticamente al recibir un huevo, portanto no
existe puntaje adicional por estos efectos.
No hay una cantidad límite de huevos a lanzar, y un huevo puede caer más de una vez sobre una misma posición. 
Sin embargo, cada vez que una posición sea atacada por un huevo, el valor de la celda en la matriz original debe 
ser expresado como "H'. Si la celda sobre la quese lanza un huevo ya había sido atacada previamente, no se debe 
asignar puntaje por este concepto.
Finalmente, al terminar el programa se debe indicar el puntaje total obtenido por el usuario.
*
 */

public class Puntaje {

	int puntos = 0;
	public static int puntosContador = 0;

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public static int getPuntosContador() {
		return puntosContador;
	}

	public static void setPuntosContador(int puntosContador) {
		Puntaje.puntosContador = puntosContador;
	}

}
