package casos24_27.caso27.ip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class CSocket {
	private String host;
	private int puertoRemoto;
	private Socket socket;
	private BufferedReader flujoEntrada;
	private PrintWriter flujoSalida;
	private BufferedReader in;

	public CSocket(InetAddress ip, int p) {
		puertoRemoto = p;
		try {
			socket = new Socket(ip, puertoRemoto);
			flujoEntrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			flujoSalida = new PrintWriter(socket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(System.in));
		} catch (UnknownHostException uh) {
			System.out.println("HOST DESCONOCIDO");
		} catch (IOException e) {
			System.out.println("CLIENTE no iniciado");
		}
	}

	public CSocket(String h, int p) {
		host = h;
		puertoRemoto = p;
		try {
			socket = new Socket(host, puertoRemoto);
			flujoEntrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			flujoSalida = new PrintWriter(socket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(System.in));
		} catch (UnknownHostException uh) {
			System.out.println("HOST DESCONOCIDO");
		} catch (IOException e) {
			System.out.println("CLIENTE no iniciado");
		}
	}

	public CSocket(Socket soc) {
		socket = soc;
		try {
			flujoEntrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			flujoSalida = new PrintWriter(socket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(System.in));
		} catch (UnknownHostException h) {
			System.out.println("HOST DESCONOCIDO");
		} catch (IOException e) {
			System.out.println("CLIENTE no iniciado");
		}
	}
	public String dameInformacion() {
		return socket.toString();
	}

	public int damePuerto() {
		return socket.getLocalPort();
	}
	public String recogeCadena() {
		String cadena = "";
		try {
			System.out.print("CLIENTE: introduce cadena: ");
			cadena = in.readLine();
		} catch (IOException e) {
			System.out.println("Problemas e I/O");
		}
		return cadena;
	}
	public String recibeCadena() {
		String cadena = null;
		try {
			cadena = flujoEntrada.readLine();
		} catch (IOException e) {
			System.out.println("No podemos RECIBIR la respuesta del SERVIDOR");
		}
		return cadena;
	}
	public void envia(String cadena) {
		flujoSalida.println(cadena);

	}
	@Override
	protected void finalize() throws Throwable {
		flujoEntrada.close();
		flujoSalida.close();
		in.close();
		socket.close();
		super.finalize();
	}

}
