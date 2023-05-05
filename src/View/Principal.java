package View;

import java.util.concurrent.Semaphore;

import controller.FilaController;
import model.CriarFila;

public class Principal {

	public static void main(String[] args) {
	
	 Semaphore semaforo1= new Semaphore(3);
	 Semaphore semaforo2= new Semaphore(1);
		
		
		CriarFila filap =new CriarFila ();
		CriarFila fila =new CriarFila ();
		for(int i =0; i<=12;i++) {
		fila.nome = "Prioritario ";
		fila.numero=(int)((Math.random()*100)+1);
		
		filap.nome = "Comum ";
		filap.numero=(int)((Math.random()*1000)+1);
		
	}
		for (int i=0;i<=12;i++) {
		FilaController f1 = new FilaController(fila, filap, semaforo1, semaforo2);
		f1.start();
		}
}
}
