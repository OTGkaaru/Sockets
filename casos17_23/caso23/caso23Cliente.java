package casos17_23.caso23;

public class caso23Cliente {
	public static void main(String[] args) {
		CDatagrama datagrama;
		int puertoLocal, puertoDestino;
		String mensaje;
		boolean iterar;
		puertoLocal = 55111;
		puertoDestino = 21111;
		datagrama = new CDatagrama(puertoLocal, puertoDestino);
		iterar = true;
		while (iterar == true) {
			mensaje = datagrama.obtenerMensaje("CLIENTE");
			datagrama.enviaPaquete(mensaje);
			if (mensaje.equals("***"))
				iterar = false;
			else {
				datagrama.recibePaquete();
				//mensaje = new String(datagrama.paquete.getData());
				mensaje = datagrama.dameMensajeRecibido();
				System.out.println("    SERVIDOR: " + mensaje);
			}
		}
	}
}