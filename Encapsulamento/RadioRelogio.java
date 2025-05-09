package Encapsulamento;

import java.util.Scanner;

public class RadioRelogio {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
//		5º Instanciar o objeto
//		nomeDaClasseDoModelo + nomeDoObjeto = new + MetodoConstrutor(Mesmo nomeDaClasse)
		ModeloRadioRelogio rr = new ModeloRadioRelogio();
		
//		6º Imprimindo estado inicial do objeto
		System.out.println("\tEstado inicial do Radio Relogio");
		System.out.println("Esta ligado? " + rr.getLigado());
		System.out.println("Volume atual: "+ rr.getVol());
		System.out.println("Estação atual: "+ rr.getEstacao());
		System.out.println("Frequencia atual: "+ rr.getFrequencia());
		System.out.println("Hora atual: "+ rr.getHora()+ ":" + rr.getMin());
		System.out.println("Despertador: "+rr.getDespertador());
		
//	7º Adicionando valores ao objeto
		rr.ligar();
		System.out.println("\n\nAtualize as horas: ");
		rr.ajustarHora(ler.nextInt());
		System.out.println("\n\nAtualize os minutos: ");
		rr.ajustarMin(ler.nextInt());
		rr.volMais();
		rr.estacao();
		rr.frequencia();
		
//	8º Impriminto novo estado do relógio
		System.out.println("\tEstado atual do Radio Relógio");
		System.out.println("Esta ligado? " + rr.getLigado());
		System.out.println("Volume atual: "+ rr.getVol());
		System.out.println("Estação atual: "+ rr.getEstacao());
		System.out.println("Frequencia atual: "+ rr.getFrequencia());
		System.out.println("Hora atual: "+ rr.getHora()+ ":" + rr.getMin());
		System.out.println("Despertador: "+rr.getDespertador());
		
	}
	

}
