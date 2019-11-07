package ejercicio6.ahorcado;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class PruebaPartida {

	public static void main(String[] args) {

		String nombreJugadorUno, nombreJugadorDos, palabraAAdivinarJugador1, palabraAAdivinarJugador2;
		int opc;
		boolean gana = false, pierde = false;

		Partida Ahorcado = new Partida("Elian", "Sergio");

		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese nombre del primer jugador");
		nombreJugadorUno = teclado.next();
		System.out.println("Ingrese nombre del segundo jugador");
		nombreJugadorDos = teclado.next();

		System.out.println(nombreJugadorUno + ", ingresa tu palabra");
		palabraAAdivinarJugador1 = teclado.next();
		Ahorcado.palabraDelJugador1(palabraAAdivinarJugador1);

		System.out.println(nombreJugadorDos + ", ingresa tu palabra");
		palabraAAdivinarJugador2 = teclado.next();
		Ahorcado.palabraDelJugador2(palabraAAdivinarJugador2);

		Ahorcado.elegirIniciador();
		
		do {
			Ahorcado.cambiarTurno();
			
			System.out.println("Turno de: " + Ahorcado.getTurnoActual().getNombre());
			
			System.out.println("Ingrese una opcion del MENU");
			System.out.println("Seleccione la opcion deseada");
			System.out.println("1. INGRESAR LETRA");
			System.out.println("2. ARRIESGAR PALBRA");
			opc = teclado.nextInt();
			
			switch (opc) {
			case 1:
				char letraArriesgada;
				System.out.println("Ingrese la letra a arriesgar");
				letraArriesgada = teclado.next().charAt(0);
				if (Ahorcado.arriesgarLetra(letraArriesgada) == true) {
					System.out.println("Correcto!");
					System.out.println("Palabra a buscar: " + Ahorcado.getTurnoActual().PalabraAAdivinar());
				} else {
					System.out.println("Incorrecto!");
					Ahorcado.getTurnoActual().perderVidas();
					System.out.println("Palabra a buscar: " + Ahorcado.getTurnoActual().PalabraAAdivinar());
				}
				break;
			case 2:
				String palabraAArriesgar;
				System.out.println("Ingrese la palabra a arriesgar");
				palabraAArriesgar = teclado.next();
				if (Ahorcado.arriesgarPalabra(palabraAArriesgar) == true) {
					gana = true;
				} else {
					pierde = true;
				}
				break;
			}
		} while (Ahorcado.getTurnoActual().getVidas() > 0 && gana == false && pierde == false);
		if(gana == true) {
			System.out.println("Correcto!");
			System.out.println("El ganador es: " + Ahorcado.getTurnoActual().getNombre());
		}
		else {
			System.out.println("Incorrecto");
			Ahorcado.cambiarTurno();
			System.out.println("El ganador es: " + Ahorcado.getTurnoActual().getNombre());
		}
	}
}
