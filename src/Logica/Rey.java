package Logica;

public class Rey extends Pieza{
	
	public Rey(int[][] posicion) {
		super(posicion);
		// TODO Auto-generated constructor stub
	}
	
	public Rey(String nombrePieza) {
		super(nombrePieza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String darTipoPieza() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int cantidadMovimientos(int[][] posicionActual, int[][] tablero) throws Exception{
		//Hacer la logica para contar los movimientos, la reinase mueve en cualquier direccion pero solo de a uno.
		return 0;
	}
}
