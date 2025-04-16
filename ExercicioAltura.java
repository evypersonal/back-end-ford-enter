package Condicional;

import java.util.Scanner;

public class ExercicioAltura {

	public static void main(String[] args) {
		double altura1;
		double altura2;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a altura da primeira pessoa:");
		altura1 = ler.nextDouble();
		
		System.out.println("Digite a altura da segunda pessoa:");
		altura2 = ler.nextDouble();
		
		if (altura1 > altura2) {
			System.out.println("A primeira pessoa é mais alta, pois tem " + altura1 + "m de altura");
		} else if (altura1 < altura2){
			System.out.println("A segunda pessoa é mais alta, pois tem " + altura2 + "m de altura");
		} else {
			System.out.println("Ambas pessoas possuem a mesma altura, sendo " + altura1 + "m de altura");
		}
				

	}

}
