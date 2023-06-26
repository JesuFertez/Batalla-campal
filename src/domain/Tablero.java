package domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import dataCarros.Caguano;
import dataCarros.Carro;
import dataCarros.Confeti;
import dataCarros.Coordenada;
import dataCarros.Kromi;
import dataCarros.Trupalla;
import util.Colores;
import util.Puntaje;

public class Tablero implements ITableroMetodos, ICrearCarros {
	private String tJuego[][];
	private String tPosiciones[][];
	private ArrayList<Carro> carros;
	private List<Huevo> huevos;
	Random random = new Random();
	int num, fila, columna;
	VerificaCoordenada verificacion = new VerificaCoordenada();
	Coordenada cor;
	Colores color;

	public Tablero() {
		tJuego = new String[15][15];
		tPosiciones = new String[15][15];
		carros = new ArrayList<Carro>(18);
		huevos = new ArrayList<Huevo>();

	}

	public void inicializarTablero() {
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				tJuego[i][j] = "a";
				tPosiciones[i][j] = "a";
			}
		}
	}

	@Override
	public void crearcarro() {
		crearKromi();
		crearCaguano();
		crearTrupalla();
	}

	@Override
	public void lanzarHuevo(int fila, int columna) {

		String valor;
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				if (tPosiciones[i][j] == tPosiciones[fila][columna] && tPosiciones[i][j] != "a") {
					System.out.println("Le di a algo...");
					int puntaje = identificar(tPosiciones[i][j]);
					// System.out.println(puntaje);
					cor = new Coordenada(fila, columna);
					tJuego[fila][columna] = Colores.ANSI_RED + Huevo.getLETRA() + color.ANSI_RESET;
					tPosiciones[fila][columna] = Colores.ANSI_RED + Huevo.getLETRA() + color.ANSI_RESET;

				} else {
					tJuego[fila][columna] = color.ANSI_YELLOW + Huevo.getLETRA() + color.ANSI_RESET;
				}
			}
		}
	}

	@Override
	public void mostrarMatriz() {
		System.out.println("**** Tablero Posiciones ****");
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				System.out.print(" " + tPosiciones[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("**** Tablero Juego ****");
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				System.out.print(" " + tJuego[i][j] + " ");
			}
			System.out.println("");
		}
	}

	@Override
	public void calcularPuntaje(int fila, int columna) {

	}

	public int generarRandom(int valorMax) {
		num = random.nextInt(valorMax);
		return num;
	}

	@Override
	public void crearKromi() {
		for (int i = 0; i < 3;) {
			fila = generarRandom(13);
			columna = generarRandom(15);
			boolean response = verificacion.verificaKromi(tPosiciones, fila, columna);
			if (response) {
				cor = new Coordenada(fila, columna);
				carros.add(new Kromi(15, LocalDate.now(), cor, LocalDate.of(2000, 03, 14), "Toyota"));
				i++;
				tPosiciones[fila][columna] = Colores.ANSI_GREEN + Kromi.getLETRA() + color.ANSI_RESET;
				tPosiciones[fila + 1][columna] = Colores.ANSI_GREEN + Kromi.getLETRA() + color.ANSI_RESET;
				tPosiciones[fila + 2][columna] = Colores.ANSI_GREEN + Kromi.getLETRA() + color.ANSI_RESET;
			}

		}

	}

	@Override
	public void crearCaguano() {
		for (int i = 0; i < 5;) {
			fila = generarRandom(15);
			columna = generarRandom(14);
			boolean response = verificacion.verificaCaguano(tPosiciones, fila, columna);
			if (response) {
				cor = new Coordenada(fila, columna);
				carros.add(new Caguano(3, LocalDate.of(2002, 12, 03), cor, 5, Confeti.AMARILLO));
				i++;
				tPosiciones[fila][columna] = color.ANSI_GREEN + Caguano.getLETRA() + color.ANSI_RESET;
				tPosiciones[fila][columna + 1] = color.ANSI_GREEN + Caguano.getLETRA() + color.ANSI_RESET;
			}
		}
	}

	@Override
	public void crearTrupalla() {
		for (int i = 0; i < 10;) {
			fila = generarRandom(15);
			columna = generarRandom(15);
			boolean response = verificacion.verificaTrupalla(tPosiciones, fila, columna);
			if (response) {
				cor = new Coordenada(fila, columna);
				carros.add(new Trupalla(2, LocalDate.of(2000, 04, 06), cor, 4, "Copa"));
				i++;
				tPosiciones[fila][columna] = color.ANSI_GREEN + Trupalla.getLETRA() + color.ANSI_RESET;
			}
		}

	}

	public int identificar(String comparar) {
		int puntaje = 0;
		switch (comparar) {
		case "K":
			puntaje=3;
			break;
		case "C":
			puntaje=2;
			break;
		case "T":
			puntaje=1;
			break;
		}
		return puntaje;
	}
}
