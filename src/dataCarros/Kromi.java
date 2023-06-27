package dataCarros;

import java.time.LocalDate;

/*
 * clase hija que representa una Kromi; se requiere saber su año de fabricación y su marca.
 */
public class Kromi extends Carro {
	private LocalDate añoFabricacion;
	private String marca;

	public Kromi() {
		super();
	}

	public Kromi(int cantidadOcupantes, LocalDate fechaIngreso, Coordenada coordenada, LocalDate añoFabricacion,
			String marca) {
		super(cantidadOcupantes, fechaIngreso, coordenada);
		this.añoFabricacion = añoFabricacion;
		this.marca = marca;
	}

	public LocalDate getAñoFabricacion() {
		return añoFabricacion;
	}

	public void setAñoFabricacion(LocalDate añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return super.toString() + "\n Kromi  \n añoFabricacion: " + añoFabricacion + " \n marca: " + marca;
	}

}
