package TP3;

public class Persona {

	private String nombre;
	private String genero;
	private long dni;
	private double peso;
	private double altura;
	private int edad;
	private boolean viva;
	private boolean mayor;
	private double pesoIdeal=0;

	public Persona(String nombre, String genero, long dni, int edad, double peso, double altura) {
		this.nombre = nombre;
		this.genero = genero;
		this.dni = dni;
		this.peso = peso;
		this.altura = altura;
		this.viva = true;
		this.edad = edad;
		this.pesoIdeal=pesoIdeal;
	}

	public void alimentar(double kilos) {
		this.peso += kilos;
	}

	public void crecer(double metros) {
		this.altura += metros;
	}

	public void cumplirAnios() {
		edad++;
	}

	public void morir() {
		viva = false;
	}

	public double pesar() {
		return this.peso;
	}

	public boolean esMayorDeEdad() {
		if (this.edad >= 18) {
			return mayor = true;
		}
		if (this.edad < 18) {
			return mayor = false;
		}
		return mayor;
	}

	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", dni=" + dni + ", peso=" + peso + ", altura="
				+ altura + ", edad=" + edad + ", viva=" + viva + "]";
	}

	public double calcularIMC() {
		this.pesoIdeal = (this.peso / (Math.pow(this.altura, 2)));
		if (this.pesoIdeal < 20) {
			return this.pesoIdeal = -1;
		}
		if (this.pesoIdeal >= 20 && this.pesoIdeal <= 25) {
			return this.pesoIdeal = 0;
		}
		if (this.pesoIdeal > 25) {
			return this.pesoIdeal = 1;
		}
		return this.pesoIdeal;
	}
}
