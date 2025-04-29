package LacosRepeticao;

import java.util.Scanner;

public class Exercicio1Vetores {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite -1 para iniciar o programa:");
		int resp = 0;
		resp = ler.nextInt();
		
		while(resp == -1) {
			int vet[]=new int[5];
			
			for(int x = 0; x< 5;x++) {
				System.out.println("Digite um numero inteiro:");
				vet[x]= ler.nextInt();
			}
			System.out.println(vet[4]);
			System.out.println("Digite um numero no qual deseja multiplicar cada dado:");
			int num1 = ler.nextInt();
			
			for(int x = 0; x<5;x++) {
				vet[x]*=num1;
			}
	
            System.out.println("Valores do vetor após a multiplicação:");
            for (int x = 0; x < 5; x++) {
                System.out.println(vet[x]);
            }
			System.out.println("Digite -1 para recomeçar, ou 0 para finalizar");
			resp = ler.nextInt();
		}
		System.out.println("Programa Encerrado!");
	}

}
