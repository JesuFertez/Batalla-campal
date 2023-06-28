package domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

import dataCarros.Caguano;
import dataCarros.Carro;
import dataCarros.Confeti;
import dataCarros.Coordenada;
import dataCarros.Kromi;
import dataCarros.Trupalla;
import util.Colores;

public class BaseCarros {
	int num, fila, columna;
	Random random = new Random();
	VerificaCoordenada verificacion = new VerificaCoordenada();
	ArrayList<Carro> carros= new ArrayList<Carro>(18);
	Coordenada cor;
	static final String K= Colores.ANSI_GREEN +"K"+ Colores.ANSI_RESET;
	static final String C= Colores.ANSI_GREEN +"C"+ Colores.ANSI_RESET;
	static final String T= Colores.ANSI_GREEN +"T"+ Colores.ANSI_RESET; 
	
	public BaseCarros() {
		
	}
	
	public int generarRandom(int valorMax) {
		num = random.nextInt(valorMax);
		return num;

	}
	
	public void crearKromi(String tPosiciones[][]) {
		for (int i = 0; i < 3;) {
			fila = generarRandom(13);
			columna = generarRandom(15);
			boolean response = verificacion.verificaKromi(tPosiciones, fila, columna);
			if (response) {
				cor = new Coordenada(fila, columna);
				carros.add(new Kromi(15, LocalDate.now(), cor, LocalDate.of(2000, 03, 14), "Toyota"));
				i++;
				tPosiciones[fila][columna] = K;
				tPosiciones[fila + 1][columna] = K;
				tPosiciones[fila + 2][columna] = K;
			}
		}
	}

	public void crearCaguano(String tPosiciones[][]) {
		for (int i = 0; i < 5;) {
			fila = generarRandom(15);
			columna = generarRandom(14);
			boolean response = verificacion.verificaCaguano(tPosiciones, fila, columna);
			if (response) {
				cor = new Coordenada(fila, columna);
				carros.add(new Caguano(3, LocalDate.of(2002, 12, 03), cor, 5, Confeti.AMARILLO));
				i++;
				tPosiciones[fila][columna] = C;
				tPosiciones[fila][columna + 1] = C;
			}
		}
	}

	public void crearTrupalla(String tPosiciones[][]) {
		for (int i = 0; i < 10;) {
			fila = generarRandom(15);
			columna = generarRandom(15);
			boolean response = verificacion.verificaTrupalla(tPosiciones, fila, columna);
			if (response) {
				cor = new Coordenada(fila, columna);
				carros.add(new Trupalla(2, LocalDate.of(2000, 04, 06), cor, 4, "Copa"));
				i++;
				tPosiciones[fila][columna] = T;
			}
		}
	}
}
