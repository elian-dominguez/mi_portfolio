package ar.edu.unlam.pb1.tp1;

public class MovimientoRectilineoUniforme {

	public static void main(String[] args) {
		Automovil miniCopper = new Automovil (120, 0.20);
		Automovil ferrari = new Automovil (200, 0.40);
		Automovil fitito = new Automovil (40, 2.25);
		
		miniCopper.Distancias();
		ferrari.Distancias();
		fitito.Distancias();

	}

}
