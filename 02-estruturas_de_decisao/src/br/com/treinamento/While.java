package br.com.treinamento;

public class While {

	public static void main(String[] args) {

		int idade = 15;
		
		while (idade < 18) {
			
			System.out.println("Você não pode dirigir. Idade: " + idade);
			idade++;
		}
		System.out.println("Você pode dirigir");
	}

}
