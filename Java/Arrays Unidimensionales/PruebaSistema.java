package ejercicio8;

public class PruebaSistema {

	public static void main(String[] args) {
		
		Sistema miSistema = new Sistema("UNLaM", 2);
		
		miSistema.setNombreDelSistema("Sistema Asistencia");
		
		String nombreSistema = miSistema.getNombreDelSistema();
		
		if(nombreSistema =="Sistema Asistencia"){
		
		System.out.println("Prueba exitosa");
		}else{
			System.out.println("Prueba fallida");
		}
		
	}

}
