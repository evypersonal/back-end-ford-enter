package Exercicios;

import java.util.Scanner;

public class Exercicio4TabuadaInput {

	public static void main(String[] args) {
		int a,b;
		System.out.println("Digite qual tabuada de inicio: ");
		Scanner ler = new Scanner(System.in);
		a = ler.nextInt();
		for(; a <=9; a++) {
			System.out.println("\nTabuada do " + a);
			for(b = 1; b <= 10; b++) {
				System.out.println(a + " * " + b + " = " + b*a);
			}
		}

	}

}
