package ar.edu.unlam.pb1.tp1;

public class Usuario {
	private String usuario;
	private String contrasena;
	private String nombre;
	private int dni;
	private int edad;
	
	public Usuario(String usuario, String contrasena, String nombre, int dni, int edad) {
	this.usuario = usuario;
	this.contrasena = contrasena;
	this.nombre = nombre;
	this.dni = dni;
	this.edad = edad;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
