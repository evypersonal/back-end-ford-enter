package Exercicios;

public class Exercicio3ForAninhadoTabuadaInvertida {

	public static void main(String[] args) {
		int a,b;
		for(a = 9; a >=2; a--) {
			System.out.println("\nTabuada do " + a);
			for(b = 10; b >= 1; b--) {
				System.out.println(a + " * " + b + " = " + b*a);
			}
		}

	}

}
