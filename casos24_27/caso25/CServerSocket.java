package casos24_27.caso25;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class CServerSocket {

	ServerSocket socketServidor;

	public CServerSocket(int puerto) {
		try {
			socketServidor = new ServerSocket(puerto);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Socket dameSocket() {
		try {
			return socketServidor.accept();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	protected void finalize() throws Throwable {
		socketServidor.close();
		super.finalize();
	}

}
