package domain;

import dataCarros.Coordenada;
import java.util.ArrayList;
import java.util.List;
import util.Colores;

public class Tablero {
	protected String tJuego[][] = new String[15][15];
	protected String tPosiciones[][] = new String[15][15];
	private List<Huevo> huevos = new ArrayList<Huevo>();
	int num, fila, columna;
	String H = Colores.ANSI_RED + "H" + Colores.ANSI_RESET;
	String HA = Colores.ANSI_YELLOW + "H" + Colores.ANSI_RESET;
	Huevo huevo = new Huevo();
	BaseCarros llamado = new BaseCarros();
	Coordenada cor = new Coordenada();

	public Tablero() {
	}

	public Tablero(String tJuego[][], String tPosiciones[][]) {
		this.tJuego = tJuego;
		this.tPosiciones = tPosiciones;
	}

	public void inicializarTablero() {
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				tJuego[i][j] = "a";
				tPosiciones[i][j] = "a";
			}
		}
		mostrarMatriz();
	}

	public String[][] crearcarro() {
		llamado.crearKromi(tPosiciones);
		llamado.crearCaguano(tPosiciones);
		llamado.crearTrupalla(tPosiciones);
		return tPosiciones;
	}

	public void lanzarHuevo(int fila, int columna) {
		Huevo huevo;
		String valor = tPosiciones[fila][columna];
		cor.setFila(fila);
		cor.setColumna(columna);
		
		if (tPosiciones[fila][columna] == llamado.K || tPosiciones[fila][columna] == llamado.C
				|| tPosiciones[fila][columna] == llamado.T) {
			tPosiciones[fila][columna] = H;
			tJuego[fila][columna] = H;
		} else {
			tPosiciones[fila][columna] = HA;
			tJuego[fila][columna] = HA;
		}

		int puntos = calcularPuntaje(valor);
		huevo = new Huevo(cor, puntos);
		huevos.add(huevo);
	}

	public void mostrarMatriz() {
		System.out.println("    **** Tablero Posiciones ****    ");
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				System.out.print(" " + tPosiciones[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("");

		System.out.println("           **** Tablero Juego ****    ");
		System.out.println("    0  1  2  3  4  5  6  7  8  9  10 11 12 13 14");
		System.out.println("");

		for (int i = 0; i < 15; i++) {
			String formateado = String.format("%-3d", i);
			System.out.print(formateado);
			for (int j = 0; j < 15; j++) {
				System.out.print(" " + tJuego[i][j] + " ");
			}
			System.out.println("");

		}
		System.out.println("");
	}

	public int calcularPuntaje(String valor) {
		int puntaje = 0;
		if (valor.contentEquals(llamado.K)) {
			System.out.println("¡¡Le haz dado a una Kromi!!");
			puntaje = 3;
		} else if (valor.contentEquals(llamado.C)) {
			System.out.println("¡¡Le haz dado a un Caguano!!");
			puntaje = 2;
		} else if (valor.contentEquals(llamado.T)) {
			System.out.println("¡¡Le haz dado a una Trupalla!!");
			puntaje = 1;
		} else {
			System.out.println("Intente nuevamente...");
			System.out.println(valor.hashCode() + "\n " + llamado.K.hashCode() + "\n" + llamado.C.hashCode() + "\n"
					+ llamado.T.hashCode());
		}
		System.out.println(" Puntos de Tiro: " + puntaje);
		return puntaje;
	}
	
	public boolean confirmacion(int entrada, int entrada2) {
		boolean response;
		
		if (entrada >=0 && entrada <15 && entrada2 >=0 && entrada2 <15) {
			response=true;
		}else {
			response = false;
		}
		return response;
	}

}
