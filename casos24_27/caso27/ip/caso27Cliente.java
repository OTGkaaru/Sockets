package casos24_27.caso27.ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class caso27Cliente {
	public static void main(String[] args) {
		CSocket csocket=null;
		int puerto;

		puerto = 6027;
		try {
			csocket = new CSocket(InetAddress.getByName("LOBEIRAS00"), puerto);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("CLIENTE (" + csocket.damePuerto() + "): inicio");
		System.out.println("CLIENTE: comunico con: " + csocket.dameInformacion());

		String cadena = "", eco;
		while (cadena.equals("***") != true) {
			cadena = csocket.recogeCadena();
			csocket.envia(cadena);
			eco = csocket.recibeCadena();
			System.out.println("CLIENTE: eco: " + eco);
		}
		System.out.println("CLIENTE: fin");

	}
}
