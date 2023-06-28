package dataCarros;

public class Coordenada {
	int fila;
	int columna;

	public Coordenada() {
	}

	public Coordenada(int fila, int columna) {
		super();
		this.fila = fila;
		this.columna = columna;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}
	

	@Override
	public String toString() {
		return "Coordenada : Fila =  " + fila +" "+" Columna = " + columna;
	}

}
