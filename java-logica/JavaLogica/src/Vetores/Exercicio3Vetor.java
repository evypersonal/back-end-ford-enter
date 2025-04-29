package Vetores;

import java.util.Scanner;

public class Exercicio3Vetor {

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


// Exercicio 1

// a) mat[2] = 4.5;
// b) mat[0] = 5.8;
// c) mat[10] = 8.9;
// d) mat[6] = 7.9;

// Exercicio 2

// O primeiro "4" é o tamanho do vetor;
// O segundo "4" é o indice do vetor;
