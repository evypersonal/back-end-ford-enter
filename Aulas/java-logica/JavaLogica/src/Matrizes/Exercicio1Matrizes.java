package Matrizes;

import java.util.Scanner;

public class Exercicio1Matrizes {

	public static void main(String[] args) {
//		Crie uma matriz de 3 por 4 e peça para o usuário preencher
//		com valores inteiros, no final mostre os valores da matriz
		int mat[][]=new int [3][4];
		Scanner ler=new Scanner(System.in);
		
		for(int linha =0;linha<3;linha++)
		{
			for(int coluna=0; coluna<4;coluna++)
			{
				System.out.println("Digite o valor para matriz-> Linha: "+linha +"coluna:"+coluna);
				mat[linha][coluna]= ler.nextInt();
			}
		}
		for(int linha =0; linha<3;linha++)
		{
			for(int coluna=0; coluna<4;coluna++)
			{
				System.out.print(mat[linha][coluna]+"\t");
			}
			System.out.println();
		}
	}

}
