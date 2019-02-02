package casos17_23.caso19;

public class caso19Servidor {
	public static void main(String[] args) {
		CDatagrama datagrama;
		int puertoLocal, puertoDestino;
		puertoLocal = 19111;
		puertoDestino = 55999;
		datagrama = new CDatagrama(puertoLocal, puertoDestino);
		System.out.println("\n SERVIDOR: Recibe Paquete");
		datagrama.recibePaquete();
		datagrama.muestraInformacionSocket();
		datagrama.muestraInformacionPaquete();
	}
}