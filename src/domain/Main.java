package domain;

public class Main {
	public static void main(String[] args) {
		Tablero tablero = new Tablero();

		tablero.inicializarTablero();
		tablero.crearcarro();
		tablero.lanzarHuevo(5, 3);
		tablero.mostrarMatriz();
	}
}
