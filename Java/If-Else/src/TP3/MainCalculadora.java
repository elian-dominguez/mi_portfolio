package TP3;

public class MainCalculadora {

	public static void main(String[] args) {
		
		Calculadora miCalculadora = new Calculadora(4, 4);
		double division = miCalculadora.dividir(3, 2);
		System.out.println("El resultado es: " +division);
	}

}
