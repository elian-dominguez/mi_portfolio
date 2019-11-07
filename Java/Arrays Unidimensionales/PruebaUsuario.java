package ejercicio8;

public class PruebaUsuario {

	public static void main(String[] args) {
		
		Usuario usuario1 = new Usuario("michael", "1d2345");
		Usuario usuario2 = new Usuario("roman", "sasd12");
		Usuario usuario3 = new Usuario("mica", "el2405");
		Usuario usuario4 = new Usuario ("roberta", "gas0303");
		Usuario usuario5 = new Usuario("chelo", "boca33123");
		Sistema s1 = new Sistema();
		
		s1.agregarUsuario(usuario1);
		
		if(s1.agregarUsuario(usuario1) == false){
			System.out.println("Cargado");
		}else{
			System.out.println("No cargado");
		}
		

	}

}
