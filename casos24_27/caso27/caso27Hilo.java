package casos24_27.caso27;

import java.net.Socket;

public class caso27Hilo extends Thread {
	CSocket csocket;

	public caso27Hilo(Socket s) {
		csocket = new CSocket(s);
	}

	public void run() {
		String cadena = "";
		while (!cadena.trim().equals("***")) {
			//recoje una cadena del flujo
			cadena = csocket.recibeCadena();
			System.out.println(" HILO: comunico con: " + csocket.dameInformacion());
			//escribe la cadena manipulada en el flujo, que sera recibida por el cliente
			csocket.envia(cadena.trim().toUpperCase());
			System.out.println(" HILO: envio >> " + cadena.trim().toUpperCase());
		}
	}
}