package casos24_27.caso26;

public class caso26Cliente {
	public static void main(String[] args) {
		CSocket csocket;
		String host, cadena;
		int puerto;
		host = "localhost";
		puerto = 6026;
		csocket = new CSocket(host, puerto);
		System.out.println("CLIENTE (" + csocket.damePuerto() + "): inicio");
		System.out.println("CLIENTE: comunico con: " + csocket.dameInformacion());
		cadena = csocket.recogeCadena();
		csocket.envia(cadena);
	}
}