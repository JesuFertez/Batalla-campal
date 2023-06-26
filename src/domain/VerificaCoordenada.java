package domain;

/*
 * Clase que verifica las coordenadas para crear los Carros.
 */
public class VerificaCoordenada {
	int num;
	int fila;
	int columna;
	boolean estado;
	String a="a";
	
	public boolean verificaKromi(String tJuego[][], int fila,int columna) {
		
		if(tJuego[fila][columna] == a && tJuego[fila+1][columna] == a 
				&& tJuego[fila+2][columna] == a) {
			estado=true;
		}else {
			estado=false;
		}
		return estado; 
	}
	
	public boolean verificaCaguano(String tJuego[][],int fila,int columna) {
		
		if(tJuego[fila][columna] == a && tJuego[fila][columna+1] == a) {
			estado=true;
		}else {
			estado=false;
		}
		return estado; 
	}
	
	public boolean verificaTrupalla(String tJuego[][],int fila,int columna) {
		
		if(tJuego[fila][columna] == a){
			estado=true;
		}else {
			estado=false;
		}
		return estado; 
	}
	
}
