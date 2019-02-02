package casos24_27.caso27.ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class caso27Servidor {
	public static void main(String[] args) {
		CServerSocket cserver=null;
		int puerto;
		int conta;

		puerto=6027;
		try {
			cserver = new CServerSocket(InetAddress.getByName("LOBEIRAS15"),puerto);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("SERVIDOR: inicio");
		conta=0;
		while (conta < 3) {
			caso27Hilo hilo = new caso27Hilo(cserver.dameSocket());
			hilo.start();
			conta++;
		}
	}
}
