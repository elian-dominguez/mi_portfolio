package ejercicio5;

import java.util.Scanner;

public class Capicua {

	public static void main(String[] args) {

		String numeroCapicua;
		int posiciones = 0;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese las posiciones del vector");
		posiciones = teclado.nextInt();

		System.out.println("Ingrese un numero");
		numeroCapicua = teclado.next();

		int vector[] = new int[numeroCapicua.length()];

		for (int i = 0; i < vector.length; i++) {
			vector[i] = Character.getNumericValue(numeroCapicua.charAt(i)); /**/

		}
		boolean esCapicua = false;
		for (int j = 0; j < vector.length / 2; j++) {
			if (vector[j] == vector[vector.length - 1 - j]) {
				esCapicua = true;
			}
		}
		if (esCapicua == true) {
			System.out.println("Es capicua");
		} else {
			System.out.println("No es capicua");
		}
	}
}
