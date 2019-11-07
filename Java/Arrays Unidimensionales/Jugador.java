package ejercicio6.ahorcado;

public class Jugador {

	private String nombre;
	private String palabraAdversario;
	public char miPalabra[];
	private int vidas = 6;
	private boolean estado;

	public Jugador(String nombre) {
		this.nombre = nombre;
		this.vidas = vidas;
	}

	public void ingresarLetra(char letra, int posicion) {
		miPalabra[posicion] = letra;
		}

	public void ingresarPalabra(int longitud) {
		miPalabra = new char[longitud];
		for (int i = 0; i < miPalabra.length; i++) {
			miPalabra[i] = '-';
		}
	}
	public String PalabraAAdivinar() {
		String texto = "";	
		for(int i=0; i<miPalabra.length; i++) {
			if(miPalabra[i] == '-') {
				texto += " _ ";
			}
			else {
				texto += miPalabra[i];
			}
		}
		return texto;
	}

	public boolean perderVidas() {
		if (vidas > 0) {
			vidas--;
			return estado = true;
		} else {
			return estado = false;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPalabraAdversario() {
		return palabraAdversario;
	}

	public void setPalabraAdversario(String palabraAdversario) {
		this.palabraAdversario = palabraAdversario;
	}

	public char[] getMiPalabra() {
		return miPalabra;
	}

	public void setMiPalabra(char[] miPalabra) {
		this.miPalabra = miPalabra;
	}

	public int getVidas() {
		return vidas;
	}

	public void setVidas(int vidas) {
		this.vidas = vidas;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
}
