package IntroducaoPOO;

import java.util.Scanner;

public class Caneta {

	public static void main(String[] args) {
//		Para criar um objeto é necessário uma sequencia
//		Criar um objeto -> Instanciar um objeto
		
		Scanner ler = new Scanner(System.in);
		double ponta;
		System.out.println("Escolha a espessura da ponta da caneta: ");
		ponta=ler.nextDouble();
		
		
//				METODO CONSTRUTOR
//		Método responsável pela criação de objetos;
//		Único método que começa com a letra maiuscula;
//		Seu nome necessáriamente deve ser o mesmo da classe;
//		Se for omitido irá construir o objeto com valores padrão;
//		Método construtor não tem tipo;
		
		
//		Classe nomeObejeto = new MetodoConstrutor()
		ModeloCaneta bic = new ModeloCaneta("azul", ponta);
		ModeloCaneta montblanc = new ModeloCaneta("preta",ponta);
		
		System.out.println("Estado da caneta bic: ");
		bic.destampar();
		bic.destampar();
		bic.estado();
		
		System.out.println();
		
		System.out.println("Estado da caneta montblanc: ");
		montblanc.destampar();
		montblanc.escrever();
		montblanc.estado();

	}

}
