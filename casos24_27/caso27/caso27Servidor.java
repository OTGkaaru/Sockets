package casos24_27.caso27;

public class caso27Servidor {
	public static void main(String[] args) {
		CServerSocket cserver;
		int puerto;
		int conta;
		puerto = 6027;
		cserver = new CServerSocket(puerto);
		System.out.println("SERVIDOR: inicio");
		conta = 0;
		while (conta < 3) {
			//Crea un hilo,  pone a la escucha a CServer,inicia el hilo con el socket retornado del Accept()
			caso27Hilo hilo = new caso27Hilo(cserver.dameSocket());
			//inicia el hilo, que recoje un mensaje, lo paasa a mayusculas y lo envia 
			hilo.start();
			conta++;
		}
	}
}