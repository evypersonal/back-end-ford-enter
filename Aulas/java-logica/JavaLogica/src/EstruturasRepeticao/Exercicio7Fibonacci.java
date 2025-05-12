package EstruturasRepeticao;

import java.util.Scanner;

public class Exercicio7Fibonacci {

	public static void main(String[] args) {
		int proximo = 0, anterior = 0, atual = 1, limite = 0;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite quanto elementos fibonacci deseja gerar: ");
		limite=ler.nextInt();
		System.out.println(atual);
		
		for(int x = 1; x<limite; x++) {
			proximo= atual+anterior;
			System.out.println(proximo);
			anterior=atual;
			atual=proximo;
		}
	}

}
