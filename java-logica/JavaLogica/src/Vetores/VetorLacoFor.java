package Vetores;

public class VetorLacoFor {

	public static void main(String[] args) {
		int vet[]=new int[5];
		System.out.println("Valores do vetor vet");
		for(int x=0;x<5;x++) {
			vet[x]=x+3;
			System.out.println("\t"+ vet[x]);
		}

	}

}
