package TP3;

public class MainCuenta {

	public static void main(String[] args) {
		
		double cantidad=100.0;				
		
		Cuenta miCuenta = new Cuenta("Juan");
		Cuenta miCuenta2 = new Cuenta("Pedro");
		
		miCuenta.titular="Andres";
		miCuenta.depositar(1000);
	    miCuenta.retirar(cantidad);	// variable auxiliar "cantidad" para retirar en este caso
	    System.out.println(miCuenta.toString());
	    miCuenta.setTitular("Sergio");
	    System.out.println(miCuenta2.getTitular());
	    
	    if(miCuenta.retirar(500)){
	    	miCuenta.depositar(200);
	    }
	    System.out.println(miCuenta.toString());
	}
}