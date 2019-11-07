package TP3;

public class MainPartidoDeTenis {

	public static void main(String[] args) {

		PartidoDeTenis miPartido = new PartidoDeTenis();

		miPartido.ganadorJuegos(6, 2);
		miPartido.ganadorJuegos(4, 6);
		miPartido.ganadorJuegos(7, 6);
		miPartido.ganadorJuegos(2, 6);
		miPartido.ganadorJuegos(7, 6);

		boolean ganador = miPartido.ganadorDelPartido();
		if (ganador == true) {
			System.out.println("El  ganador es el jugador uno");
		} else {
			System.out.println("El ganador es el jugador dos");
		}
	}

}
