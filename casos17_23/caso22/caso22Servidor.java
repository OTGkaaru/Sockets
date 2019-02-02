package casos17_23.caso22;

public class caso22Servidor {
	public static void main(String[] args) {
		CDatagrama datagrama;
		int puertoLocal, puertoDestino;
		String mensaje;
		boolean iterar;
		puertoLocal = 21111;
		puertoDestino = 55111;
		datagrama = new CDatagrama(puertoLocal, puertoDestino);
		System.out.println(" SERVIDOR");
		iterar = true;
		while (iterar == true) {
			datagrama.recibePaquete();	
			mensaje = datagrama.dameMensajeRecibido();
			if (mensaje.contains("***"))
				iterar = false;
			else {
				System.out.println("Mensaje recibido: " + mensaje);			
				datagrama.mensajedef=mensaje +" ("+mensaje.length()+" caracteres)";
				datagrama.enviaPaquete(datagrama.mensajedef);
			}
		}
	}
}