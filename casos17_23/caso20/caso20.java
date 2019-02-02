package casos17_23.caso20;

public class caso20 {
	public static void main(String[] args) {
		CDatagrama datagrama;
		int puertoLocal, puertoDestino;
		String mensaje;
		puertoLocal = 55000;
		puertoDestino = 20111;
		datagrama = new CDatagrama(puertoLocal, puertoDestino);
		mensaje = datagrama.obtenerMensaje();
		datagrama.enviaPaquete(mensaje);
		datagrama.muestraInformacionSocket();
		datagrama.muestraInformacionPaquete();
	}
}