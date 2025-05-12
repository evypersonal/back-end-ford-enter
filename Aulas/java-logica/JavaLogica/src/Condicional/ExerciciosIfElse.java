package Condicional;

import java.util.Scanner;

public class ExerciciosIfElse {

	public static void main(String[] args) {
		int n1;
		int n2;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um número:");
		n1 = ler.nextInt();
		
		Scanner ler1 = new Scanner(System.in);
		System.out.println("Digite outro número:");
		n2 = ler1.nextInt();
		
		if(n1 == n2)
			System.out.println("Os números são iguais");
		else
			System.out.println("Os números são diferentes");

	}

}
