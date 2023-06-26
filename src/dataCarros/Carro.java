package dataCarros;

import java.time.LocalDate;

/*
 * es la clase padre que definirá los distintos vehículos que administra la PKS.
 *  De cada carro se interesa saber la cantidad de ocupantes, la fecha de ingreso 
 *  a la institución y su ubicación en el tablero virtual de 15×15 (se recomienda 
 *  registrar la fila y columna en atributos independientes). Debe tener un método 
 *  que permita desplegar sus datos básicos y sus
coordenadas en el tablero.
 */
public class Carro {
	private int cantidadOcupantes;
	private LocalDate fechaIngreso;
	private Coordenada coordenada;

	public Carro() {
	}

	public Carro(int cantidadOcupantes, LocalDate fechaIngreso, Coordenada ubicacion) {
		super();
		this.cantidadOcupantes = cantidadOcupantes;
		this.fechaIngreso = fechaIngreso;
		this.coordenada = ubicacion;
	}

	public int getCantidadOcupantes() {
		return cantidadOcupantes;
	}

	public void setCantidadOcupantes(int cantidadOcupantes) {
		this.cantidadOcupantes = cantidadOcupantes;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Coordenada getCoordenada() {
		return coordenada;
	}

	public void setCoordenada(Coordenada ubicacion) {
		this.coordenada = ubicacion;
	}

	@Override
	public String toString() {
		return "Carro  \n cantidadOcupantes: " + cantidadOcupantes + " \n fechaIngreso: " + fechaIngreso
				+ " \n coordenada: " + coordenada;
	}

}
