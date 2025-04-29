package Exercicios;

import java.util.Scanner;

public class Exercicio4WhileTabuada {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int t, resp;
		System.out.println("Digite -1 para visualizar as tabuadas:");
		resp = ler.nextInt();
		
		while(resp == -1) {
			System.out.println("Escolha qual tabuada quer começar:");
			t=ler.nextInt();
			for(;t <= 9;t++) {
				System.out.println("Tabuada do "+ t );
				for(int x =1; x<=10;x++) {
					System.out.println(t+" * " + x + " = " + t*x);
				}
			}
			System.out.println("Digite -1 para repetir");
			resp=ler.nextInt();
		}

	}

}
