package TP3;

public class Cerradura {

	private int claveDeApertura;
	private int cantidadDeFallos = 0;
	private int cantidadDeFallosQueLaBloquean = 2;
	private boolean estado;

	public Cerradura(int claveDeApertura, int cantidadDeFallos) {
		this.claveDeApertura = claveDeApertura;
		this.cantidadDeFallos = cantidadDeFallos;
		this.estado = false;
	}

	public Cerradura(int claveDeApertura) {
		this.claveDeApertura = claveDeApertura;
		this.estado = false;
	}

	public void abrir(int clave) {
		if (this.claveDeApertura == clave) {
			this.estado = true;
		}
		if (this.claveDeApertura != clave) {
			this.estado = false;
		}
	}

	public boolean cerrar() {
		if (this.estado == true) {
			this.estado = false;
		}
		return this.estado;
	}

	public boolean estaAbierta() {
		return this.estado;
	}

	public boolean fueBloqueada() {
		if (this.estado == true) {
			return this.estado;
		} else if (this.estado == false) {
			this.cantidadDeFallos++;
			if (this.cantidadDeFallos > this.cantidadDeFallosQueLaBloquean) {
				this.estado = false;
			}
		}
		return this.estado;
	}
}