package casos24_27.caso26;

import java.net.Socket;

public class caso26Hilo extends Thread {
	CSocket csocket;

	public caso26Hilo(Socket s) {
		csocket = new CSocket(s);
	}

	public void run() {
		String cadena;
		System.out.println(" HILO: comunico con: " + csocket.dameInformacion());
		cadena = csocket.recibeCadena();	
		System.out.println(" HILO: cadena recibida: " + cadena);	
	}
}