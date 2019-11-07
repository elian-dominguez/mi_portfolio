package tp5;

public class Calculadora {

	private double operador1;
	private double operador2;
	private double resultado;
	private boolean primo;

	public Calculadora() {
		operador1 = 0.0;
		operador2 = 0.0;
		resultado = 0.0;
	}

	public Calculadora(double operador1, double operador2) {
		this.operador1 = operador1;
		this.operador2 = operador2;
	}

	public double sumar() {
		return resultado = operador1 + operador2;

	}

	public double sumar(double operador1, double operador2) {
		return resultado = operador1 + operador2;
	}

	public double restar() {
		return resultado = operador1 - operador2;
	}

	public double restar(double operador1, double operador2) {
		return resultado = operador1 - operador2;
	}

	public double multiplicar() {
		return resultado = operador1 * operador2;
	}

	public double multiplicar(double operador1, double operador2) {
		return resultado = operador1 * operador2;
	}

	public double dividir() {
		if (operador2 != 0) {
			resultado = operador1 / operador2;
		} else {
			resultado = 0;
		}
		return resultado;
	}

	public double dividir(double operador1, double operador2) {
		if (operador2 != 0) {
			resultado = operador1 / operador2;
		} else {
			resultado = 0;
		}
		return resultado;
	}

	public int potencia(int base, int exponente) {
		double resultado = 1;
		for (int i = 0; i < exponente; i++) {
			resultado *= base;
		}
		return (int) resultado;
	}

	public boolean esPrimo(int numero) {
		int aux;
		for (int i = 2; i < numero; i++) {
			aux = numero % i;
			if (aux == 0) {
				return primo=false;
			} else {
				return primo=true;
			}
		}
		return primo;
	}
}
