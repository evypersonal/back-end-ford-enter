package ExerciciosPOO;

import java.util.Scanner;

public class Carro {
	public static void main(String[] args) {
		
//		Criando os objetos
		ModeloCarro ford= new ModeloCarro();
		ModeloCarro fiat= new ModeloCarro();
		ModeloCarro bmw= new ModeloCarro();
		
//		Definindo a cor do carro
		Scanner ler=new Scanner(System.in);
		System.out.println("Descreva a cor do carro:");
		String cor;
		cor = ler.next();
		
//		Imprimindo o estado atual
		ford.estado();
		
		
	}
}
//Exercicio 1
// Criar uma classificação para o objeto carro
// 4 atributos e 4 métodos
// instanciar o objeto
// mostrar estado atual

//Exercicio 2
//Alterar o método construtor do objeto carro
//Instanciar um novo objeto