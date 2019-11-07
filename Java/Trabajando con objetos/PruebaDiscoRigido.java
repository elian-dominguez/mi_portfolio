package ar.edu.unlam.pb1.tp1;

public class PruebaDiscoRigido {

	public static void main(String[] args) {
		DiscoRigido seagate = new DiscoRigido(10);
		DiscoRigido hitachi = new DiscoRigido(20);
		DiscoRigido westernDigital = new DiscoRigido(32);
		DiscoRigido toshiba = new DiscoRigido(48);

		seagate.pasaje();
		hitachi.pasaje();
		westernDigital.pasaje();
		toshiba.pasaje();
	}

}
