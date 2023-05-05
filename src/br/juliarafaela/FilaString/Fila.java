package br.juliarafaela.FilaString;

public class Fila {
	No início;
	No fim;
	
	public Fila() {
		início = null;
		fim = null;
	}
	
	public boolean isEmpty() {
		if(início == null && fim == null) {
			return true;
			
		}else {
			return false;
		}
	}
	
	public void insert(Object valor) {
		No elemento = new No();
		elemento.dado = (Object) valor;
		
		if(início == null) {
			início = elemento;
			fim = elemento;
			elemento.proximo = null;
			
		}else {
			if(início == fim && início != null) {
				fim = elemento;
				início.proximo = fim;
				fim.proximo = null;
				
			} else {
				fim.proximo = elemento;
				elemento.proximo = null;
				fim = elemento;
			}
		}
		
		
	}
	
	public Object remove() throws Exception {
		if(isEmpty()) {
			throw new Exception("Fila vazia");
		}
		No auxiliar = início;
		if(início == fim && início != null) {
			início = null;
			fim = null;
			
		}else {
			início = início.proximo;
		}
		return auxiliar.dado;
	}
	
	public int size() {
		int cont = 0;
		if(!isEmpty()) {
			No auxiliar = início;
			while(auxiliar != null){
				cont++;
				auxiliar = auxiliar.proximo;
			}
		}
		return cont;
		
	}
	
	public void list() throws Exception {
		if(isEmpty()) {
			throw new Exception("Fila vazia");
	}
		No auxiliar = início;
		
		while(auxiliar != null) {
			System.out.print(auxiliar.dado);
			auxiliar = auxiliar.proximo;
		}
		}
	

}