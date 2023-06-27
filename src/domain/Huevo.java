package domain;

import dataCarros.Coordenada;

/*
 * Clase "Huevo": clase que define cada lanzamiento realizado dentro del tablero.
 * Por cada instancia de esta clase se desea conocer la fila donde cayó el proyectil, 
 * la columna y el puntaje obtenido en ellanzamiento.
 */

public class Huevo {
private Coordenada coordenada;
private int puntajeLanzamiento;

public Huevo() {;
}

public Huevo(Coordenada cordenada, int puntajeLanzamiento) {
	this.coordenada= cordenada;
	this.puntajeLanzamiento = puntajeLanzamiento;
}

public Coordenada getUbicacion() {
	return coordenada;
}

public void setUbicacion(Coordenada coordenada) {
	this.coordenada = coordenada;
}


public int getPuntajeLanzamiento() {
	return puntajeLanzamiento;
}

public void setPuntajeLanzamiento(int puntajeLanzamiento) {
	this.puntajeLanzamiento = puntajeLanzamiento;
}

@Override
public String toString() {
	return " ****** Huevo ****** \n Coordenada: " + coordenada + " \n Puntaje lanzamiento: " + puntajeLanzamiento;
}


}
