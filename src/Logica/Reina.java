package Logica;

public class Reina extends Pieza{

	public Reina(int[][] posicion) {
		super(posicion);
		// TODO Auto-generated constructor stub
	}

	public Reina(String nombrePieza) {
		super(nombrePieza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String darTipoPieza() {
		// TODO Auto-generated method stub
		return this.getNombrePieza();
	}
	
	
	public int cantidadMovimientos(int[][] posicionActual, int[][] tablero) throws Exception{
		//Hacer la logica para contar los movimientos, la reinase mueve en cualquier direccion la cantidad que quiera.
		return 0;
		
	}

}
