package casos24_27.caso24;

public class caso24Cliente {
	public static void main(String[] args) {
		CSocket csocket;
		String host;
		int puerto;
		host = "localhost";
		puerto = 6024;
		csocket = new CSocket(host, puerto);
		System.out.println("CLIENTE");
		System.out.println("CLIENTE-información: " + csocket.dameInformacion());
	}
}