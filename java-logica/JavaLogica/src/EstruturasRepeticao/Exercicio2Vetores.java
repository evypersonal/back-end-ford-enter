package LacosRepeticao;

import java.util.Scanner;

public class Exercicio2Vetores{

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite -1 para iniciar o programa:");
		int resp = 0;
		resp = ler.nextInt();
		
		while(resp == -1) {
			int vet1[]= new int[5];
			int vet2[]= new int[5];
			int vet3[]= new int[5];
			
			System.out.println("\tPrimeiro Vetor");
			for(int x = 0; x< 5;x++) {
				System.out.println("Digite um numero inteiro:");
				vet1[x]= ler.nextInt();
			}
			System.out.println("\n\tSegundo Vetor");
			for(int x = 0; x< 5;x++) {
				System.out.println("Digite um numero inteiro:");
				vet2[x]= ler.nextInt();
			}
			for(int x = 0; x<5;x++) {
				vet3[x]= vet1[x] + vet2[x];
			}
	
            System.out.println("Valores do vetores somados:");
            for (int x = 0; x < 5; x++) {
                System.out.println(vet3[x]);
            }
			System.out.println("Digite -1 para recomeçar, ou 0 para finalizar");
			resp = ler.nextInt();
		}
		System.out.println("Programa Encerrado!");
	}

}
