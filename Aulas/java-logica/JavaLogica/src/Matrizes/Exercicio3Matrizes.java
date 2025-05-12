package Matrizes;

import java.util.Scanner;

public class Exercicio3Matrizes {

	public static void main(String[] args) {
//		Crie duas matrizes quadradas de 4x4 e um vetor resp de 4 posições. O usuário deverá digitar os valores das duas matrizes e o programa devera multiplicar os elementos da diagonal principal das duas matrizes e armazenar o resultado no vetor resp. No final será impresso os valores das matrizes e do vetor.
		int mat1[][]=new int [4][4];
		int mat2[][]=new int [4][4];
		int resp[]=new int[4];
		Scanner ler = new Scanner(System.in);
		
//		Alimentação da primeira matriz pelo usuario
		for(int linha =0;linha<4;linha++)
		{
			for(int coluna=0; coluna<4;coluna++)
			{
				System.out.println("Digite o valor para matriz 1-> Linha: "+linha +"coluna:"+coluna);
				mat1[linha][coluna]= ler.nextInt();	
			}
		}
		
//		Alimentação da segunda matriz pelo usuario
		for(int linha =0;linha<4;linha++)
		{
			for(int coluna=0; coluna<4;coluna++)
			{
				System.out.println("Digite o valor para matriz 2-> Linha: "+linha +"coluna:"+coluna);
				mat2[linha][coluna]= ler.nextInt();	
			}
		}
		
//		Alimentando o vetor
		for(int x = 0;x<4;x++)
		{
			resp[x]=mat1[x][x]*mat2[x][x];
		}
		
//		Impressão da primeira matriz
		System.out.println("\tPrimeira Matriz");
		for(int linha =0; linha<3;linha++)
		{
			for(int coluna=0; coluna<5;coluna++)
			{
				System.out.print(mat1[linha][coluna]+"\t");
			}
			System.out.println();
		}
		
//		Impressão da segunda matriz
		System.out.println("\tSegunda Matriz");
		for(int linha =0; linha<4;linha++)
		{
			for(int coluna=0; coluna<4;coluna++)
			{
				System.out.print(mat2[linha][coluna]+"\t");
			}
			System.out.println();
		}
		
//		Impressão do vetor
		System.out.println("\tVetor");
        for (int x = 0; x < 4; x++) {
            System.out.println(resp[x]);
        }
	}

}
