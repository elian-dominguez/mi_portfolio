package TP3;

public class Alarma {

	private boolean encendida;
	private int codigoDeSeguridad;

	public Alarma(int codigoDeSeguridad) {
		this.codigoDeSeguridad = codigoDeSeguridad;
		this.encendida = false;
	}

	public void encender(int clave) {
		if (clave == this.codigoDeSeguridad) {
			this.encendida = true;
		}
	}

	public void apagar() {
		if (this.encendida == true) {
			this.encendida = false;
		}
		if (this.encendida == false) {
			this.encendida = false;
		}
	}

	public boolean activada() {
		if (this.encendida == true) {
			return true;
		}
		if (this.encendida == false) {
			return false;
		}
		return this.encendida;
	}
}
