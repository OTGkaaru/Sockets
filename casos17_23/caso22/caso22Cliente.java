package casos17_23.caso22;

public class caso22Cliente {
	public static void main(String[] args) {
		CDatagrama datagrama;
		int puertoLocal, puertoDestino;
		String mensaje;
		boolean iterar;
		puertoLocal = 55111;
		puertoDestino = 21111;
		datagrama = new CDatagrama(puertoLocal, puertoDestino);
		System.out.println(" CLIENTE");
		iterar = true;
		while (iterar == true) {
			mensaje = datagrama.obtenerMensaje();
			datagrama.enviaPaquete(mensaje);
			if (mensaje.equals("***"))
				iterar = false;
			else {
				datagrama.recibePaquete();
				//mensaje = new String(datagrama.paquete.getData());
				mensaje = datagrama.dameMensajeRecibido();
				System.out.println("Respuesta recibida del SERVIDOR: " + mensaje);
			}
		}
	}
}