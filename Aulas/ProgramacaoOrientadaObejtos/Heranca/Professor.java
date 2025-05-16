package Heranca;

public class Professor extends Pessoa{
	
//	O gerenciador de acesso "Protected" permite que a mesma classe e seus descendentes possam ter acesso aos seus atributos;
	
	protected String disciplina;
	protected double salario;
	
	public void aumentarSalario(double x) 
	{
		this.salario+=x;
	}
	
//	Getters e Setters

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}
