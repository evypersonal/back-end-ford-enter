package Condicional;

import java.util.Scanner;

public class ExercicioIMC {

	public static void main(String[] args) {
		double peso;
		double altura;
				
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite seu peso: ");
		peso = ler.nextDouble();
		
		System.out.println("Digite sua altura: ");
		altura = ler.nextDouble();
		
		double imc = peso / (altura * altura);
		System.out.println("Seu imc é : " + imc + ".");
		
		if (imc < 17 || imc == 17) {
			System.out.println("Você está muito abaixo do peso!");
		} else if (imc > 17 && imc < 18.5){
			System.out.println("Você está abaixo do peso!");
		} else if (imc > 18.5 && imc < 25) {
			System.out.println("Parabéns! Você está no peso ideal!");
		} else if (imc > 25 && imc < 30) {
			System.out.println("Você está acima do peso!");
		} else if (imc > 30 && imc < 35) {
			System.out.println("Você está com obesidade 1º Grau!");
		} else if (imc > 35 && imc < 40) {
			System.out.println("Você está com obesidade 2º Grau! (Severa)");
		} else {
			System.out.println("Você está com obesidade 3º Grau! (Mórbida)");
		}

	}

}
