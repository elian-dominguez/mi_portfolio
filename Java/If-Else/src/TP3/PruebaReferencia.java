package TP3;

public class PruebaReferencia {

	public static void main(String[] args) {
		String texto1 = new String("Hola");
		String texto2 = new String("Hola");

		if (texto1 == texto2) {
			System.out.println("Los textos son iguales");
		} else {
			System.out.println("Los textos son distintos");
		}
	}

}
