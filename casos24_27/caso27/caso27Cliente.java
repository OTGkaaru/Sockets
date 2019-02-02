package casos24_27.caso27;

public class caso27Cliente {
	public static void main(String[] args) {
		CSocket csocket;
		String host;
		int puerto;
		host = "localhost";
		puerto = 6027;
		csocket = new CSocket(host, puerto);
		System.out.println("CLIENTE (" + csocket.damePuerto() + "): inicio");
		System.out.println("CLIENTE: comunico con: " + csocket.dameInformacion());
		String cadena = "", eco;
		
		while (cadena.equals("***") != true) {
			//recoje una cadena de teclado
			cadena = csocket.recogeCadena();
			//la escribe en el flujo de salida
			csocket.envia(cadena);
			//recoje la cadena manipulada que devuelve el socket
			eco = csocket.recibeCadena();
			System.out.println("CLIENTE: eco: " + eco);
		}
		System.out.println("CLIENTE: fin");
	}
}