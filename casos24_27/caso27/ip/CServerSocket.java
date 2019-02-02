package casos24_27.caso27.ip;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class CServerSocket {
	private int puerto;
	private ServerSocket servidor;
	private Socket socket;

	public CServerSocket(InetAddress ip, int p) {
		puerto = p;
		try {
			servidor = new ServerSocket(puerto,30,ip);
		} catch (IOException e) {
			System.out.println("Problemas con ServerSocket");
		}
	}

	public CServerSocket(int p) {
		puerto = p;
		try {
			servidor = new ServerSocket(puerto);
		} catch (IOException e) {
			System.out.println("Problemas con ServerSocket");
		}
	}


	public Socket dameSocket() {
		try {
			socket = servidor.accept();
		} catch (IOException e) {
			System.out.println("Problemas con cliente-accept");
		}
		return socket;
	}

	@Override
	protected void finalize() throws Throwable {
		try {
			servidor.close();
		} catch (IOException e) {
			System.out.println("Problemas al cerrar ServerSocket");
		}
		super.finalize();
	}

}
