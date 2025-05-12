package EstruturasRepeticao;

import java.util.Scanner;

public class Exercicio2TabuadaInput {

	public static void main(String[] args) {
		int x;
		System.out.println("Digite o número que deseja obter a tabuada: ");
		Scanner ler = new Scanner(System.in);
		x = ler.nextInt();
		System.out.println("Tabuada do número " + x + ":");
		
		for(int i = 1; i <=10 ; i++)
			System.out.println(x + " * " + i + " = " + x*i);

	}

}
