package ar.edu.unlam.pb1.tp1;

public class Calculadora {
	private int operador1;
	private double operador2;
	
	public Calculadora() {
		
	}
	public Calculadora(int operador1, double operador2) {
		this.operador1 = operador1;
	}
	
	public double sumar() {
		return this.operador1 + this.operador2;
	}
	public double sumar(int operador1, double operador2) {
		return operador1 + operador2;
	}
	
	public double restar() {
		return this.operador1 - this.operador2;
	}
	
	public double restar(int operador1, double operador2) {
		return operador1 - operador2;
	}
	
	public double multiplicar() {
		return this.operador1* this.operador2;
	}
	
	public double multiplicar(int operador1, double operador2) {
		return operador1* operador2;
	}
	
	public double dividir() {
		return this.operador1/ this.operador2;
	}
	
	public double dividir(int operador1, double operador2) {
		return operador1/ operador2;
	}
}
