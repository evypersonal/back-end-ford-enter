package ExercicioHeranca;

public class Cavalo extends Mamiferos{
	private String raca;
	private int velocidade;
	private boolean domesticado;
	private boolean movimento;
	
	public void correr() {
		if(this.movimento==true) {
			this.velocidade+=5;
			System.out.println("O cavalo está se movendo à "+ this.velocidade+ " Km/H.");
		}else {
			System.out.println("Cavalo esta parado!");
		}
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public boolean getDomesticado() {
		return domesticado;
	}

	public void setDomesticado(boolean domesticado) {
		this.domesticado = domesticado;
	}

	public boolean getMovimento() {
		return movimento;
	}

	public void setMovimento(boolean movimento) {
		this.movimento = movimento;
	}
	
}
