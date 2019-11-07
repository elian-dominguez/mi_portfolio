package ar.edu.unlam.pb1.tp1;

public class MainCalculadora {

	public static void main(String[] args) {
		Calculadora miCalculadora = new Calculadora(2, 2);
		double division = miCalculadora.dividir(2, 2);
		System.out.println("El resultado es: "+division);

	}

}
