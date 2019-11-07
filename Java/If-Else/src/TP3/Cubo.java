package TP3;

public class Cubo {

	private float longitudLado;
	private float lado;
	private float superficieDeCara;
	private float volumen;
	
	public Cubo(float lado){
		this.lado=lado;
		this.longitudLado=longitudLado;
		this.superficieDeCara=superficieDeCara;
		this.volumen=volumen;
	}

	public float getLongitudLado() {
		return longitudLado;
	}

	public void setLongitudLado(float longitudLado) {
		this.longitudLado = longitudLado;
	}

	public float getSuperficieDeCara() {
		return superficieDeCara;
	}

	public void setSuperficieDeCara(float superficieDeCara) {
		this.superficieDeCara = superficieDeCara;
	}

	public float getVolumen() {
		return volumen;
	}
}
