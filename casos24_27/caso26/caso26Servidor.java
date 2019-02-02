package casos24_27.caso26;

public class caso26Servidor {
	public static void main(String[] args) {
		CServerSocket cserver;
		int puerto;
		puerto = 6026;
		cserver = new CServerSocket(puerto);
		System.out.println("SERVIDOR");
		caso26Hilo hilo = new caso26Hilo(cserver.dameSocket());
		hilo.start();
	}
}