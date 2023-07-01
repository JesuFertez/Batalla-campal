package domain;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int op, fila, columna;
		boolean salir = false;
		Scanner scanner = new Scanner(System.in);
		Tablero tablero = new Tablero();
		
		tablero.inicializarTablero();
		tablero.crearcarro();
		tablero.mostrarMatriz();
		System.out.println("********* Bienvenido a Batalla campal *********");
		boolean confirmacion = false;

		do {
			System.out.println("");
			System.out.println("*** Menú de ejecuciones ***" + "\n Ingrese una opción...... ");
			System.out.println(" …OP 1: Lanzar huevo \n …OP 2: Mostrar Puntaje "
					+ "\n …OP 3: Rendirse / Mostar Tablero de Posiciones \n …OP 4: Salir ");

			op = scanner.nextInt();
			switch (op) {

			case 1:
				do {
					System.out.println("Ingrese una fila");
					fila = scanner.nextInt();
					System.out.println("Ingrese una columna");
					columna = scanner.nextInt();
					confirmacion = tablero.confirmacion(fila, columna);
				} while (!confirmacion);
				tablero.lanzarHuevo(fila, columna);
				break;
			case 2:
				tablero.mostrarPuntaje();
				break;
			case 3:
				tablero.mostrarMatriz();
				break;
			case 4:
				salir = true;
				break;
			default:
				System.out.println("Por favor ingrese una opción válida ");
			}
		} while (!salir);
		System.out.print("########     ###    ########    ###    ##       ##          ###       \n"
				+ "##     ##   ## ##      ##      ## ##   ##       ##         ## ##      \n"
				+ "##     ##  ##   ##     ##     ##   ##  ##       ##        ##   ##     \n"
				+ "########  ##     ##    ##    ##     ## ##       ##       ##     ##    \n"
				+ "##     ## #########    ##    ######### ##       ##       #########    \n"
				+ "##     ## ##     ##    ##    ##     ## ##       ##       ##     ##    \n"
				+ "########  ##     ##    ##    ##     ## ######## ######## ##     ##  ");
		System.out.println("");
		System.out.println("    ######     ###    ##     ## ########     ###    ##                \n"
				+ "   ##    ##   ## ##   ###   ### ##     ##   ## ##   ##                \n"
				+ "   ##        ##   ##  #### #### ##     ##  ##   ##  ##                \n"
				+ "   ##       ##     ## ## ### ## ########  ##     ## ##                \n"
				+ "   ##       ######### ##     ## ##        ######### ##                \n"
				+ "   ##    ## ##     ## ##     ## ##        ##     ## ##                \n"
				+ "    ######  ##     ## ##     ## ##        ##     ## ########    ");
		scanner.close();
	}
}
