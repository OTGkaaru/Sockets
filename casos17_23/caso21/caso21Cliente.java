package casos17_23.caso21;

public class caso21Cliente {
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
		}
	}
}