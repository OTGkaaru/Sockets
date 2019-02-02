package casos17_23.caso23;

public class caso23Servidor {
	public static void main(String[] args) {
		CDatagrama datagrama;
		int puertoLocal, puertoDestino;
		String mensaje;
		boolean iterar;
		puertoLocal = 21111;
		puertoDestino = 55111;
		datagrama = new CDatagrama(puertoLocal, puertoDestino);
		System.out.println("SERVIDOR: estoy esperando");
		iterar = true;
		while (iterar == true) {
			datagrama.recibePaquete();	
			mensaje = datagrama.dameMensajeRecibido();
			System.out.println("    CLIENTE: " + mensaje);
			if (mensaje.contains("***"))
				iterar = false;
			else {		
				datagrama.mensajedef=datagrama.obtenerMensaje("SERVIDOR");
				datagrama.enviaPaquete(datagrama.mensajedef);
			}
		}
	}
}