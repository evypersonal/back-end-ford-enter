package Exercicios;

public class Exercicio1ForAninhadoTabuadaInvertida {

	public static void main(String[] args) {
		int a,b;
		for(a = 9; a >=2; a--) {
			System.out.println("\nTabuada do " + a);
			for(b = 1; b <= 10; b++) {
				System.out.println(a + " * " + b + " = " + b*a);
			}
		}

	}

}
