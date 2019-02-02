package casos24_27.caso24;

import java.net.Socket;

public class caso24Servidor {
	public static void main(String[] args) {
		CServerSocket cserver;
		int puerto;
		Socket socket;
		puerto = 6024;
		cserver = new CServerSocket(puerto);
		System.out.println("SERVIDOR");
		socket = cserver.dameSocket();
		System.out.println("CLIENTE-información: " + (new CSocket(socket)).dameInformacion());
	}
}