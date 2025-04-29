package Matrizes;

import java.util.Scanner;

public class introducao {

	public static void main(String[] args) {
//		int test[][]=new int[5][8]; // criação de uma matriz sem valor; Sendo composta por 5 linhas e 8 colunas;
//		int test1[][]= {{1,2,3,4,5},{6,7,8,9,0},{11,12,13,14}};
		
		int mat0[][]= new int[3][4];
		int mat1[][]= {{1,2,3},{4,5,6},{7,8,9}};
		Scanner ler = new Scanner(System.in);
		for(int linha=0;linha<3;linha++)
		{
			for(int coluna=0;coluna<4;coluna++)
			{
				System.out.println("Digite o valor para a matriz:");
				mat0[linha][coluna]=ler.nextInt();
			}
		}
		
		System.out.print("Valores da mat0");
		System.out.println();
		
		for(int linha=0;linha<3;linha++) 
			{
				for(int coluna=0;coluna<4;coluna++) 
				{
					System.out.print(mat0[linha][coluna]+"\t");
				}
				System.out.println();
			}
	}
}
