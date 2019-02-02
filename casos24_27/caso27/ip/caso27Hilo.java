package casos24_27.caso27.ip;

import java.net.Socket;

public class caso27Hilo extends Thread {
	CSocket csocket;

	public caso27Hilo(Socket s) {
		csocket = new CSocket(s);
	}

	public void run() {
		String cadena = "";
		while (!cadena.trim().equals("***")) {
			cadena = csocket.recibeCadena();
			System.out.println("   HILO: comunico con: " + csocket.dameInformacion());
			csocket.envia(cadena.trim().toUpperCase());
			System.out.println("   HILO: envio >> " + cadena.trim().toUpperCase());
		}
	}
}