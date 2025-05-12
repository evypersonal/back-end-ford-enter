package Exercicios;

public class Exercicio2ForAninhadoTabuadaInvertida {

	public static void main(String[] args) {
		int a,b;
		for(a = 2; a <=9; a++) {
			System.out.println("\nTabuada do " + a);
			for(b = 10; b >= 1; b--) {
				System.out.println(a + " * " + b + " = " + b*a);
			}
		}

	}

}
