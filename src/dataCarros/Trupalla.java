package dataCarros;
/*
 * "Trupalla": clase hija que representa un Trupalla;
 *  de este tipo de elemento interesa conocer su nivel 
 *  de armadura (entero entre 1 a 5) y el nombre de la persona que lo manipula.
 */

import java.time.LocalDate;

public class Trupalla extends Carro {
	private int nivelArmadura;
	private String nombreConductor;

	public Trupalla() {
		super();
	}

	public Trupalla(int cantidadOcupantes, LocalDate fechaIngreso, Coordenada coordenada, int nivelArmadura,
			String nombreConductor) {
		super(cantidadOcupantes, fechaIngreso, coordenada);
		this.nivelArmadura = nivelArmadura;
		this.nombreConductor = nombreConductor;
	}

	public int getNivelArmadura() {
		return nivelArmadura;
	}

	public void setNivelArmadura(int nivelArmadura) {
		this.nivelArmadura = nivelArmadura;
	}

	public String getNombreConductor() {
		return nombreConductor;
	}

	public void setNombreConductor(String nombreConductor) {
		this.nombreConductor = nombreConductor;
	}

	@Override
	public String toString() {
		return super.toString() + "\n Trupalla  \n nivelArmadura: " + nivelArmadura + " \n nombreConductor: "
				+ nombreConductor;
	}

}
