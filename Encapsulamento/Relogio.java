package Encapsulamento;

import java.util.Scanner;

public class Relogio {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
//		Modelo do relógio
		ModeloRelogio rolex= new ModeloRelogio();
		int minuto, hora;
		
		
//		Imprimindo o estado atual
		System.out.println("Estado inicial do relógio: ");
		System.out.println("Horario atual: "+rolex.getHora()+":"+rolex.getMinuto());
		System.out.println("O despertador está ativado? "+rolex.getDespertador());
		

//		Adicionando valores ao relógio
		System.out.println("\n\nDigite a nova hora: ");
		hora = ler.nextInt();
		
		System.out.println("Digite o valor dos minutos: ");
		minuto= ler.nextInt();
		
		rolex.ajustarHora(hora);
		rolex.ajustarMin(minuto);
		rolex.despertar();
		
//		Imprimindo novo horário
		System.out.println("Estado atual do relógio: ");
		System.out.println("Horario atual: "+rolex.getHora()+":"+rolex.getMinuto());
		System.out.println("O despertador está ativado? "+rolex.getDespertador());
		
	}

}
