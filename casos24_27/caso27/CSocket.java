package casos24_27.caso27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;

public class CSocket {

	Socket socket;
	BufferedReader br;
	PrintWriter pw;
	BufferedReader teclado;

	public CSocket(Socket socket) {

		try {
			this.socket = socket;
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream(), true);
			teclado = new BufferedReader(new InputStreamReader(System.in));
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

	public CSocket(String host, int puerto) {
		try {
			socket = new Socket(host, puerto);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream(), true);
			teclado = new BufferedReader(new InputStreamReader(System.in));
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

	// muestra informaciond de la conexion
	public String dameInformacion() {
		return socket.toString();
	}

	public int damePuerto() {
		return socket.getLocalPort();
	}

	// recoje texto del teclado
	public String recogeCadena() {
		String recogido = null;
		System.out.print("CLIENTE: introduce cadena: ");
		try {
			recogido = teclado.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return recogido;
	}

	//recibe el buffer del flujo y lo almacena en "recibido"
	public String recibeCadena() {
		String recibido = null;
		try {
			recibido = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return recibido;
	}

	//escribe en el flujo de salida el mensaje que recibe por parametros
	public void envia(String mensaje) {
		pw.println(mensaje);
	}

	@Override
	protected void finalize() throws Throwable {
		pw.close();
		br.close();
		teclado.close();
		socket.close();
		super.finalize();
	}
}
