package EstruturasRepeticao;

import java.util.Scanner;

public class Exercicio4Fatorial {

	public static void main(String[] args) {
		int num,fat=1;
		
		System.out.println("Digite um número que deseja obter o fatorial: ");
		Scanner ler = new Scanner(System.in);
		num = ler.nextInt();
		
		for(int x = num; x>=1; x--) {
			fat = fat*x; //fat*=x
		}
		System.out.println(fat);
	}
}

