package domain;

/*
 * Clase que verifica las coordenadas para crear los Carros.
 */
public class VerificaCoordenada {
	int fila;
	int columna;
	boolean estado;
	
	public boolean verificaKromi(String tJuego[][], int fila,int columna,String a) {
		
		if(tJuego[fila][columna] == a && tJuego[fila+1][columna] == a 
				&& tJuego[fila+2][columna] == a) {
			estado=true;
		}else {
			estado=false;
		}
		return estado; 
	}
	
	public boolean verificaCaguano(String tJuego[][],int fila,int columna, String a) {
		
		if(tJuego[fila][columna] == a && tJuego[fila][columna+1] == a) {
			estado=true;
		}else {
			estado=false;
		}
		return estado; 
	}
	
	public boolean verificaTrupalla(String tJuego[][],int fila,int columna, String a) {
		
		if(tJuego[fila][columna] == a){
			estado=true;
		}else {
			estado=false;
		}
		return estado; 
	}
	
	public boolean bonoKromi(String tJuego[][],int fila, int columna, String a) {
		
		if(fila<13 && tJuego[fila][columna]==a && tJuego[fila+1][columna]==a && tJuego[fila+2][columna]==a ||
				fila <14 && fila>0 && tJuego[fila][columna]==a && tJuego[fila-1][columna]==a && tJuego[fila+1][columna]==a ||
				fila>1 && tJuego[fila][columna]==a && tJuego[fila-1][columna]==a && tJuego[fila-2][columna]==a) {
			estado = true;
		}else {
			estado=false;
		}
		
	return estado;
	}
	
	public boolean bonoCaguano(String tJuego[][],int fila,int columna, String a) {
		
		if(fila<14 && tJuego[fila][columna] == a && tJuego[fila][columna+1] == a||
				fila>0 && tJuego[fila][columna] == a && tJuego[fila][columna-1] == a) {
			estado=true;
		}else {
			estado=false;
		}
		return estado; 
	}
	
}
