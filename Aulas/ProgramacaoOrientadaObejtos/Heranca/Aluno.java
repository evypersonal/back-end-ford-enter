package Heranca;

// extends -> mostra que a classe "Aluno" é filho da classe "Pessoa";
public class Aluno extends Pessoa{

	private int ra;
	private String curso;
	
	public void entregarAtividade()
	{
		System.out.println("Atividade entregue com sucesso...");
	}
	
//	Getters e Setters

	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
