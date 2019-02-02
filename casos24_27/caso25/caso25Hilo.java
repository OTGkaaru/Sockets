package casos24_27.caso25;

import java.net.Socket;

public class caso25Hilo extends Thread {
	CSocket csocket;

	public caso25Hilo(Socket s) {
		csocket = new CSocket(s);
	}

	public void run() {
		System.out.println("HILO");
		System.out.println("CLIENTE-información: " + csocket.dameInformacion());
	}
}