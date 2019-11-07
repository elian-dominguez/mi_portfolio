package TP3;

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
		double resultado = 0;
		if(this.operador2 != 0) {
		resultado = this.operador1/ this.operador2;
		}
		return resultado;
	}
	
	public double dividir(int operador1, double operador2) {
		double resultado = 0;
		if(operador2 != 0) {
		resultado = operador1/ operador2;
		}
		return resultado;
	}
	public void esPositivo() {
		if(this.operador1>0 && this.operador2>0) {
			System.out.println("El numero es positivo");
		}else{
			System.out.println("El numero es negativo");
		}
	}
}

