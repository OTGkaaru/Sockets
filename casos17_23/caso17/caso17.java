package casos17_23.caso17;

public class caso17 {
	public static void main(String[] args) {
		CDatagrama datagrama;
		int puertoLocal, puertoDestino;
		puertoLocal = 55777;

		puertoDestino = 17111;
		datagrama = new CDatagrama(puertoLocal, puertoDestino);
		datagrama.nuevoPaqueteParaEnviar();
		datagrama.muestraInformacionSocket();
		datagrama.muestraInformacionPaquete();
	}

}
