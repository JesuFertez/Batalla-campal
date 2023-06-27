package dataCarros;
/*
 * Clase "Caguano": clase hija que representa un Caguano; 
 * de esta clase se interesa saber su alcance de tiro, y color de confeti que arroja.
 */

import java.time.LocalDate;

public class Caguano extends Carro {
	private int alcanceTiro;
	private Confeti confeti;

	public Caguano() {
		super();
	}

	public Caguano(int cantidadOcupantes, LocalDate fechaIngreso, Coordenada coordenada, int alcanceTiro,
			Confeti confeti) {
		super(cantidadOcupantes, fechaIngreso, coordenada);
		this.alcanceTiro = alcanceTiro;
		this.confeti = confeti;
	}

	public int getAlcanceTiro() {
		return alcanceTiro;
	}

	public void setAlcanceTiro(int alcanceTiro) {
		this.alcanceTiro = alcanceTiro;
	}

	public Confeti getConfeti() {
		return confeti;
	}

	public void setConfeti(Confeti confeti) {
		this.confeti = confeti;
	}

	@Override
	public String toString() {
		return super.toString() + "\n Caguano  \n alcanceTiro: " + alcanceTiro + " \n confeti: " + confeti;
	}

}
