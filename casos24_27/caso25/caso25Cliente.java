package casos24_27.caso25;

public class caso25Cliente {
	public static void main(String[] args) {
		CSocket csocket;
		String host;
		int puerto;
		host = "localhost";
		puerto = 6025;
		csocket = new CSocket(host, puerto);
		System.out.println("CLIENTE");
		System.out.println("CLIENTE-información: " + csocket.dameInformacion());
	}
}