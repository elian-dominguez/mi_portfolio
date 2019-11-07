package ejercicio8;

public class Sistema {

	private String nombreDelSistema;
	private Usuario[] usuarios; /*
								 * Si defino array aca todos van a tener la
								 * misma longitud
								 */
	private int cantidadUsuariosIngresados = 0;
	private boolean loguea;

	public Sistema() {
		usuarios = new Usuario[20];
	}

	public Sistema(String nombreDelSistma, int tamanio) {
		this.nombreDelSistema = nombreDelSistema;
		usuarios = new Usuario[tamanio]; /*
											 * Le paso la cantidad de elementos
											 * por parametro del constructor
											 */

	}

	public String getNombreDelSistema() {
		return nombreDelSistema;
	}

	public boolean loguearUsuarios(String nombre, String contrasenia) {
		for (int i = 0; i < usuarios.length; i++) {
			if (usuarios[i].getNombre() == nombre && usuarios[i].getContrasenia() == contrasenia) {
				return loguea = true;
			} else {
				return loguea = false;
			}
		}
		return loguea;
	}

	public boolean agregarUsuario(Usuario usuario) {
		for (int i = 0; i < usuarios.length; i++) {
			if (this.usuarios[i] != null) {
				if (usuarios[i].getNombre().equals(usuario.getNombre())) {
					return false; /* corta metodo */ /* break: corta ciclo */
				}
			} else
				break;
		}
		usuarios[this.cantidadUsuariosIngresados] = usuario;
		this.cantidadUsuariosIngresados++;
		return true;
		/*
		 * if(this.usuarios [i] == null){ this.usuarios[i] = usuarios; break;
		 */
	}

	public void setNombreDelSistema(String nombreDelSistema) {
		this.nombreDelSistema = nombreDelSistema;
	}

}
