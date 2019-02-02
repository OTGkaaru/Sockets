package casos24_27.caso24;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;

public class CSocket {

	Socket socket;

	public CSocket(Socket socket) {
		this.socket = socket;
	}

	public CSocket(String host, int puerto) {
		try {
			socket = new Socket(host, puerto);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ConnectException e) {
			System.out.println("Conexion rechazada");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String dameInformacion() {
		return socket.toString();
	}

}
