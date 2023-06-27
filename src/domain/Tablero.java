package domain;

import dataCarros.Coordenada;
import java.util.ArrayList;
import java.util.List;
import util.Colores;

public class Tablero {
	protected String tJuego[][] = new String[15][15];
	protected String tPosiciones[][] = new String[15][15];
	private List<Huevo> huevos;
	int num, fila, columna;
	Colores color;
	Huevo huevo = new Huevo();
	BaseCarros llamado = new BaseCarros();
	Coordenada cor = new Coordenada();

	public Tablero() {
	}

	public Tablero(String tJuego[][], String tPosiciones[][]) {
		this.tJuego = tJuego;
		this.tPosiciones = tPosiciones;
		huevos = new ArrayList<Huevo>();
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

	public void crearcarro() {
		llamado.crearKromi(tPosiciones);
		llamado.crearCaguano(tPosiciones);
		llamado.crearTrupalla(tPosiciones);
	}

	public void lanzarHuevo(int fila, int columna) {
		Huevo huevo;
		String valor = "";
		
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				if (tPosiciones[i][j] == tPosiciones[fila][columna] && tPosiciones[i][j] != "a") {
					valor = tPosiciones[fila][columna];
					cor.setFila(fila); 
					cor.setColumna(columna);
				}
			}
		}
		int puntos = calcularPuntaje(valor);
		huevo= new Huevo(cor,puntos);
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

		System.out.println("    **** Tablero Juego ****    ");
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				System.out.print(" " + tJuego[i][j] + " ");
			}
			System.out.println("");
		}
	}

	public int calcularPuntaje(String valor) {
		
		int puntaje = 0;
		if(valor == llamado.K) {
			puntaje = 3;
		}else if(valor== llamado.C) {
			puntaje = 2;
		}else if(valor == llamado.T) {
			puntaje = 1;
		}
		else {
			System.out.println("Intente nuevamente...");
		}
		System.out.println(" Puntos de Tiro " + puntaje);
		return puntaje;
	}
	
}
