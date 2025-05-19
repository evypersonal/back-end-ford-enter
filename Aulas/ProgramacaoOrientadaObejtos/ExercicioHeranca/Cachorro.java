package ExercicioHeranca;

public class Cachorro extends Mamiferos{
	private String raca;
	private String porte;
	private String comportamento;
	
	
	public void latir() {
		System.out.println("Au Au 🐶");
	}
	
	public void morder() {
		System.out.println("Mordendo...");
	}


	public String getRaca() {
		return raca;
	}


	public void setRaca(String raca) {
		this.raca = raca;
	}


	public String getPorte() {
		return porte;
	}


	public void setPorte(String porte) {
		this.porte = porte;
	}


	public String getComportamento() {
		return comportamento;
	}


	public void setComportamento(String comportamento) {
		this.comportamento = comportamento;
	}
	
	
}
