package Condicional;

import java.util.Scanner;

public class ExemploIfElse {

	public static void main(String[] args) {
		int n;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um numero");
		n = ler.nextInt();
		
		if (n > 5)
			System.out.println("O número é maior que 5");
		else
			System.out.println("O número é igual ou menor que 5");
	}
		
}