package domain;

import dataCarros.Coordenada;
import java.util.ArrayList;
import java.util.List;
import util.Colores;

public class Tablero {
	protected String tJuego[][] = new String[15][15];
	protected String tPosiciones[][] = new String[15][15];
	private List<Huevo> huevos = new ArrayList<Huevo>();
	BaseCarros llamado = new BaseCarros();
	String H = Colores.ANSI_RED + "H" + Colores.ANSI_RESET;
	String HA = Colores.ANSI_YELLOW + "H" + Colores.ANSI_RESET;
	List<Integer> puntosBono = new ArrayList<Integer>();
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
	}

	public String[][] crearcarro() {
		llamado.crearKromi(tPosiciones);
		llamado.crearCaguano(tPosiciones);
		llamado.crearTrupalla(tPosiciones);
		return tPosiciones;
	}

	public void lanzarHuevo(int fila, int columna) {
		String valor = tPosiciones[fila][columna];
		Coordenada cor = new Coordenada(fila,columna);
		
		if (tPosiciones[fila][columna] == llamado.K || tPosiciones[fila][columna] == llamado.C
				|| tPosiciones[fila][columna] == llamado.T) {
			tPosiciones[fila][columna] = H;
			tJuego[fila][columna] = H;
		} else {
			tPosiciones[fila][columna] = HA;
			tJuego[fila][columna] = HA;
		}

		int puntos = calcularPuntaje(valor,cor);
		Huevo huevo = new Huevo(cor, puntos);
		huevos.add(huevo);
	}

	public void mostrarMatriz() {
		System.out.println("           **** Tablero Posiciones ****    ");
		System.out.println("    0  1  2  3  4  5  6  7  8  9 10 11 12 13 14");
		System.out.println("");
		for (int i = 0; i < 15; i++) {
			String formateado = String.format("%-3d", i);
			System.out.print(formateado);
			for (int j = 0; j < 15; j++) {
				System.out.print(" " + tPosiciones[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("");

		System.out.println("            **** Tablero Juego ****    ");
		System.out.println("    0  1  2  3  4  5  6  7  8  9 10 11 12 13 14");
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

	public int calcularPuntaje(String valor,Coordenada cor) {
		int puntaje = 0;
		if (valor.contentEquals(llamado.K)) {
			System.out.println("¡¡Le haz dado a una Kromi!!");
			puntaje = 3;
			sumaBonus(cor,"K");
		} else if (valor.contentEquals(llamado.C)) {
			System.out.println("¡¡Le haz dado a un Caguano!!");
			puntaje = 2;
			sumaBonus(cor,"C");
		} else if (valor.contentEquals(llamado.T)) {
			System.out.println("¡¡Le haz dado a una Trupalla!!");
			puntaje = 1;
		} else {
			System.out.println("Intente nuevamente...");
		}
		System.out.println(" Puntos de Tiro: " + puntaje);
		
		return puntaje;
	}
	
	public void sumaBonus(Coordenada cor, String letra) {
		VerificaCoordenada verifica = new VerificaCoordenada();
		int puntajePlus=0;
		System.out.println(letra);
		
		switch(letra) {
		case "K":
			if(verifica.verificaKromi(tPosiciones, cor.getFila(), cor.getColumna(),H)) {
				puntajePlus=10;
				puntosBono.add(puntajePlus);
				System.out.println("");
				System.out.println(" *** Se suman 10 puntos de Bonificación *** ");
				System.out.println("");
			}
			break;
		case "C":
			if(verifica.verificaCaguano(tPosiciones,cor.getFila(), cor.getColumna(),H)) {
				puntajePlus = 7; 
				puntosBono.add(puntajePlus);
				System.out.println("");
				System.out.println(" *** Se suman 7 puntos de Bonificación *** ");
				System.out.println("");
			}
			break;
		}
	}
	
	public void mostrarPuntaje() {
		int puntos=0;
		int total=0;
		int bonos=0;
		System.out.println("     ****** Huevos ******     ");
		System.out.println("");
		for (int i=0; i<huevos.size(); i++) {
			System.out.println(" "+i+" " +huevos.get(i));
			puntos += huevos.get(i).getPuntajeLanzamiento();
		}
		System.out.println("");
		System.out.println("    **** Puntaje Total ****    ");
		
		for (int i=0; i<puntosBono.size();i++) {
			System.out.println(i);
			bonos+=puntosBono.get(i);
		}
		total= puntos+bonos;
		System.out.println("     *** "+total+" ***    ");
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
