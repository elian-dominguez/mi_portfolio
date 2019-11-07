package TP3;

public class Cuenta {

	private double saldo;
	public String titular;

	public Cuenta(String titular) {
		this.saldo = 0.0;
		this.titular = titular;
	}

	public Cuenta() {
		this.saldo = 0.0;
	}

	public String crearCuenta() {
		return this.titular;
	}

	public void depositar(double cantidad) {
		this.saldo += cantidad;
	}

	public boolean retirar(double cantidad) {

		if (this.saldo >= cantidad && cantidad>0) {
			this.saldo -= cantidad;
			return true;
		} else {
			return false;
		}
	}
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", titular=" + titular + "]";
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
		
	}
	
	
}
