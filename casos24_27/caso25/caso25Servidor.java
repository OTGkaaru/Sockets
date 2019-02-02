package casos24_27.caso25;

public class caso25Servidor {
	public static void main(String[] args) {
		CServerSocket cserver;
		int puerto;
		puerto = 6025;
		cserver = new CServerSocket(puerto);
		System.out.println("SERVIDOR");
		caso25Hilo hilo = new caso25Hilo(cserver.dameSocket());
		hilo.start();
	}
}