package Logica;

public abstract class Pieza {
	private String nombrePieza;
	private int [][] tablero = {{1,2,3,4,5,6,7,8},{1,2,3,4,5,6,7,8},{1,2,3,4,5,6,7,8},{1,2,3,4,5,6,7,8},{1,2,3,4,5,6,7,8},{1,2,3,4,5,6,7,8},{1,2,3,4,5,6,7,8},{1,2,3,4,5,6,7,8}};
	protected int[][] posicion;
	public String getNombrePieza() {
		return nombrePieza;
	}
	public void setNombrePieza(String nombrePieza) {
		this.nombrePieza = nombrePieza;
	}
	public int[][] getPosicion() {
		return posicion;
	}
	public void setPosicion(int[][] posicion) {
		this.posicion = posicion;
	}
	public int [][] getTablero() {
		return tablero;
	}
	public void setTablero(int [][] tablero) {
		this.tablero = tablero;
	}

	
	public Pieza(String nombrePieza) {
		this.nombrePieza = nombrePieza;
	}
	public Pieza(int[][]posicion) {
		this.posicion = posicion;
	}
	
	public abstract String darTipoPieza();
}