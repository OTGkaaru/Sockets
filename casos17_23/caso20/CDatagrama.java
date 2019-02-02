package casos17_23.caso20;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class CDatagrama {
	DatagramSocket datSoc;
	InetAddress address;
	String mensajedef = "Mi nombre es PAQUETE 17";;
	int pLocal, pRemoto;
	byte[] mensaje;
	DatagramPacket paquete;

	public CDatagrama(int pLocal, int pRemoto) {

		this.pLocal = pLocal;
		this.pRemoto = pRemoto;
		
		try {
			datSoc = new DatagramSocket(pLocal);
			address = InetAddress.getLocalHost();

		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void nuevoPaqueteParaEnviar() {
			mensaje = mensajedef.getBytes();
			paquete = new DatagramPacket(mensaje, mensaje.length, address, pRemoto);
			
	}

	public void muestraInformacionSocket() {
		System.out.println("INFORMACION DEL SOCKET");
		System.out.println("======================");
		try {
			System.out.println(
					"InetAddress.getLocalHost().getHostAddress() : " + address.getLocalHost().getHostAddress());
			System.out.println("socket.getLocalPort()                       : " + datSoc.getLocalPort());
			System.out.println();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			System.out.println("Problemas con LOCALHOST");
		}

	}

	public void muestraInformacionPaquete() {
		System.out.println("INFORMACION DEL SOCKET");
		System.out.println("======================");
		System.out.println("new String(paquete.getData()                : " + new String(paquete.getData()));
		System.out.println("paquete.getLength()                         : " + paquete.getLength());
		System.out.println("paquete.getAddress().getHostAddress()       : " + paquete.getAddress().getHostAddress());
		System.out.println("paquete.getPort()                           : " + paquete.getPort());
		System.out.println();
	}
	
	public String obtenerMensaje() {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in)); 
		try {
			System.out.print("Introduce mensaje: ");
			mensajedef=br.readLine();	
			System.out.println();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mensajedef;
	}

	public void enviaPaquete(String mensaje2) {
		mensaje=mensaje2.getBytes();		
		nuevoPaqueteParaEnviar();
	}
	
	// destructor
	@Override
	protected void finalize() throws Throwable {
		datSoc.close();
		super.finalize();
	}
	

	
}
