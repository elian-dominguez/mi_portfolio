package TP3;

public class Nota {

	private float valor;
	
	public Nota(float valor){
		this.valor=valor;
	}
	public float getValor() {
		return valor;
	}
	public boolean aprobado(){
		if(this.valor>=7){
			return true;
		}else{
			return false;
		}
	}
	public void recuperar(float nuevoValor){
		this.valor=nuevoValor;
			
	}
}