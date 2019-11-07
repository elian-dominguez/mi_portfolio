package ejercicio6.ahorcado;

import java.util.Scanner;

public class Ahorcado {

	public static void main(String[] args) {

		int numeroCaracteres;
		String nombre;
		String palabra = "";
		String palabraAArriesgar;
		char ahorcado1[] = palabra.toCharArray();
		char ahorcado2[] = palabra.toCharArray();
		char letra;
		int vidas = 6;
		int opc;
		boolean gano=false, perdio=false;

		Scanner teclado = new Scanner(System.in);

		System.out.println("-------------------");
		System.out.println("AHORCADO");
		System.out.println("-------------------");
		System.out.println("Ingresa nombre del jugador");
		nombre = teclado.next();
		System.out.println("Ingrese la palabra");
		palabra = teclado.next();

		for (int i = 0; i < ahorcado2.length; i++) {
			ahorcado2[i] = '-';
			System.out.print(" "+ahorcado2[i]);
		}
		
		System.out.println("INICIO DEL JUEGO");
		do {
		System.out.println("1. INGRESAR LETRA");
		System.out.println("2. ARRIESGAR PALABRA");
		opc = teclado.nextInt();
		
		switch (opc) {
		case 1:
			System.out.println("Ingrese la letra");
			letra = teclado.next().charAt(0);

			for (int i = 0; i < ahorcado1.length; i++) {
				char letraAdivinar = ahorcado1[i];
				if (letra == letraAdivinar) {
					ahorcado1[i] = letra;
					System.out.println("Correcto");
					System.out.println(ahorcado1[i]);
				} else {
					System.out.println("Incorrecto");
					vidas--;
					if (vidas < 0) {
						System.out.println("Perdiste todas tus vidas");
					}
				}
			}
			break;
		case 2:
			System.out.println("Ingresa la palabra a arriesgar");
			palabraAArriesgar = teclado.next();
			
			if(palabraAArriesgar.equals(palabra)) {
				System.out.println("Felicidades ganaste");
				gano = true;
			}else{
				System.out.println("Incorrecto, perdiste");
				perdio = true;
				}
			break;
			}
		}while(gano == false && perdio == false);
	}
}
