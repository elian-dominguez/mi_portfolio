package TP3;

public class PartidoDeTenis {

	private int setJugador1;
	private int setJugador2;
	private int juegoJugador1;
	private int juegoJugador2;
	private boolean ganador;

	public void ganadorJuegos(int juegoJugador1, int juegoJugador2) {
		this.juegoJugador1 = juegoJugador1;
		this.juegoJugador2 = juegoJugador2;

		if (this.juegoJugador1 > 5 && this.juegoJugador2 < 6) {
			setJugador1++;
		}
		if (this.juegoJugador2 > 5 && this.juegoJugador1 < 5) {
			setJugador2++;
		}
		if (this.juegoJugador1 > 6) {
			setJugador1++;
		}
		if (this.juegoJugador2 > 6) {
			setJugador2++;
		}
	}

	public boolean ganadorDelPartido() {
		if (setJugador1 > setJugador2) {
			return ganador = true;
		} else {
			return ganador = false;
		}
	}
}
