package EstruturasRepeticao;

import java.util.Scanner;

public class Exercicio6ProgressaoGeometrica {

	public static void main(String[] args) {
		int init,raz,fim;
		
		System.out.println("Digite o número para a progressão:");
		Scanner ler = new Scanner(System.in);
		init = ler.nextInt();
		System.out.println("Digite o número para a finalização da progressão:");
		fim = ler.nextInt();
		System.out.println("Digite o número para a razão:");
		raz = ler.nextInt();
		
		for(int x=init; x<=fim; x*=raz/*x=x*raz*/) {
			System.out.println(x);
		}
	}
}