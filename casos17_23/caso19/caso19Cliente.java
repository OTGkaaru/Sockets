package casos17_23.caso19;

public class caso19Cliente {
	public static void main(String[] args) {
		CDatagrama datagrama;
		int puertoLocal, puertoDestino;
		puertoLocal = 55999;
		puertoDestino = 19111;
		datagrama = new CDatagrama(puertoLocal, puertoDestino);
		System.out.println("\n CLIENTE: Envia Paquete");
		datagrama.asignarMensaje("Mi nombre es PABLO SEGUNDO ALONSO");
		datagrama.enviaPaquete();
		datagrama.muestraInformacionSocket();
		datagrama.muestraInformacionPaquete();
	}
}