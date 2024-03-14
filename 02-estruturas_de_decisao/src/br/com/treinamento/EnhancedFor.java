package br.com.treinamento;

public class EnhancedFor {

	public static void main(String[] args) {
		
		int[] arraylist = {10, 20, 30, 40, 50, 60, 70};
		int contador = 0;
		System.out.println("Lista de números: ");
		for(int array : arraylist) {
			System.out.println(array);
			contador++;
		}
		System.out.println("Quantidade de registros: " + contador);
	}

}
