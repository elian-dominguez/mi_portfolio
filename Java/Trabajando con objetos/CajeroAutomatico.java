public class CajeroAutomatico {

	public static void main(String[] args) {
	
	Cuenta miCuenta = new Cuenta ("Elian");
	
	System.out.println (miCuenta.toString());
	miCuenta.depositar(100.0);
	System.out.println (miCuenta.toString());
	miCuenta.retirar(50.0);
	System.out.println (miCuenta.toString());
	
	miCuenta.setTitular("Sergio");
	miCuenta.getTitular();
	System.out.println (miCuenta.toString());
	
	}
}