package Logica;

public class Peon extends Pieza {

	public Peon(int[][] posicion) {
		super(posicion);
		// TODO Auto-generated constructor stub
	}
	
	public Peon(String nombrePieza) {
		super(nombrePieza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String darTipoPieza() {
		// TODO Auto-generated method stub
		return this.getNombrePieza();
	}
	
	private boolean primerMovimiento = true;
	
	public int cantidadMovimientos(int[][] posicionActual, int[][] tablero) throws Exception{
		// TODO Auto-generated method stub
		
		int fila = posicionActual[0][0];
		int columna = posicionActual[0][1];
		int movimientos = 0;
		
		if (primerMovimiento == true) {
			if (tablero[fila + 1][columna] == 0 && tablero[fila + 2][columna] == 0) {
				movimientos += 2;
			} else if (tablero[fila + 1][columna] == 0) {
				movimientos ++;
			}
		} else {
			if (tablero[fila + 1][columna] == 0) {
				movimientos ++;
			}
		}
		
	primerMovimiento = false;
		return movimientos;
	}


}
