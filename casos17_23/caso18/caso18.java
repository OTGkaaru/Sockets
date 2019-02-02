package casos17_23.caso18;


public class caso18 {
	public static void main(String[] args) {
		CDatagrama datagrama;
		int puertoLocal, puertoDestino;
		puertoLocal = 55888;
		puertoDestino = 18111;
		datagrama = new CDatagrama(puertoLocal, puertoDestino);
		datagrama.asignarMensaje("Mi nombre es PABLO PRIMERO MANSO");
		datagrama.nuevoPaqueteParaEnviar();
		datagrama.muestraInformacionSocket();
		datagrama.muestraInformacionPaquete();
	}
}