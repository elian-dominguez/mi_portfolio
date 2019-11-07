package ejercicio6.ahorcado;

public class Partida {

	private Jugador jugador1;
	private Jugador jugador2;
	private Jugador turnoActual;

	public Partida(String nombreJugador1, String nombreJugador2) {
		jugador1 = new Jugador(nombreJugador1);
		jugador2 = new Jugador(nombreJugador2);
	}

	public void elegirIniciador() {
		double aleatorio = Math.random();
		if (aleatorio < 0.5) {
			turnoActual = jugador1;
		} else {
			turnoActual = jugador2;
		}
	}
	public void palabraDelJugador1(String palabraAAdivinarPorAdversario) {
		jugador1.setPalabraAdversario(palabraAAdivinarPorAdversario);
		jugador2.ingresarPalabra(palabraAAdivinarPorAdversario.length());
	}
	
	public void palabraDelJugador2(String palabraAAdivinarPorAdversario) {
		jugador2.setPalabraAdversario(palabraAAdivinarPorAdversario);
		jugador1.ingresarPalabra(palabraAAdivinarPorAdversario.length());
	}

	public boolean arriesgarLetra(char letraArriesgada) {
		boolean letraEncontrada = false;
		Jugador adversario;
		if (turnoActual == jugador1) {
			adversario = jugador2;
		} else {
			adversario = jugador1;
		}
		String letraAdivinar = adversario.getPalabraAdversario();
		for (int i = 0; i < letraAdivinar.length(); i++) {
			char letraActual = letraAdivinar.charAt(i);
			if (letraActual == letraArriesgada) {
				turnoActual.ingresarLetra(letraArriesgada, i);
				letraEncontrada = true;
			}
		}
		return letraEncontrada;
	}

	public boolean arriesgarPalabra(String palabraArriesgada) {
		Jugador adversario;
		if (turnoActual == jugador1) {
			adversario = jugador2;
		} else {
			adversario = jugador1;
		}

		if (adversario.getPalabraAdversario().equals(palabraArriesgada)) {
			return true;
		} else {
			return false;
		}
	}

	public void cambiarTurno() {
		if (turnoActual == jugador1) {
			turnoActual = jugador2;
		} else {
			turnoActual = jugador1;
		}
	}

	public Jugador getTurnoActual() {
		return turnoActual;
	}
}
