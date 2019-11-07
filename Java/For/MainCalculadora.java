package tp5;

public class MainCalculadora {

	public static void main(String[] args) {
		
		Calculadora miCalcu = new Calculadora();
		
		int potencia = miCalcu.potencia(2, 3);
		double suma = miCalcu.sumar(23, 5);
		System.out.println("Resultado: "+suma);
		System.out.println("Resultado: "+potencia);
		
		boolean primo = miCalcu.esPrimo(4);
		if(primo == true){
			System.out.println("Es primo");
		}else{
			System.out.println("No es primo");
		}
		

	}

}
