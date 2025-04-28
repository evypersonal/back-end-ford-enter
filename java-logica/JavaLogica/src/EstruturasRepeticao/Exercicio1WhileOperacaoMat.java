package LacosRepeticao;

import java.util.Scanner;

public class Exercicio1WhileOperacaoMat {

	public static void main(String[] args) {
		System.out.println("\tDigite '1' para fazer operações matemáticas:");
		Scanner ler = new Scanner(System.in);
		int resp = ler.nextInt();
		
		while(resp == 1) {
			int n1,n2;
			String op;
			System.out.println("Digite 1 número:");
			n1 = ler.nextInt();
			
			System.out.println("Digite o segundo número:");
			n2 = ler.nextInt();
			ler.nextLine();
			
			System.out.println("Qual operação deseja fazer?(+,-,*,/)");
			op = ler.nextLine();
			
			if(op.equals("+")) {
				System.out.println(n1+n2);
			}else if(op.equals("-")){
				System.out.println(n1-n2);
			}else if(op.equals("*")) {
				System.out.println(n1*n2);
			}else if(op.equals("/")) {
				System.out.println(n1/n2);
			}else {
				System.out.println("Operação não existe!");
			}
			System.out.println("Deseja fazer uma nova operação? Se sim, digite '1', senão digite '0' para sair");
			resp = ler.nextInt();
			
			
		}
		System.out.println("Programa Encerrado");
	}

}
