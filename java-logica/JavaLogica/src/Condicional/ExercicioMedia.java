package Condicional;

import java.util.Scanner;

public class ExercicioMedia {

	public static void main(String[] args) {
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		nota1 = ler.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = ler.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = ler.nextDouble();
		
		System.out.println("Digite a quarta nota: ");
		nota4 = ler.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if(media == 5 || media < 5) {
			System.out.println("Aluno reprovado com nota final de " + media + ".");
		} else if (media < 7 || media == 7) {
			System.out.println("Aluno está de recuperação com nota final de " + media + ".");
		} else {
			System.out.println("Aluno aprovado com nota final de " + media + ".");
		}
	}

}
