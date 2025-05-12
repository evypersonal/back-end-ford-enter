package ExerciciosPOO;

public class ResolucaoExercicio1Molde {
//	1º Criando os Atributos
	
	String cor;
	String placa;
	int ano;
	boolean ligado;
	int velocidade;
	
//	2º Criando Métodos
	
	public void ligar() {
		if(this.ligado == true) {
			System.out.println("Erro! Carro está ligado!");
		}else {
			this.ligado=true;
		}
	}
	
	public void desligar() {
		if(this.ligado == false) {
			System.out.println("Erro! Carro está desligado!");
		}else {
			this.ligado=false;
		}
	}
	
	public void acelerar() {
		if(this.ligado==false) {
			System.out.println("Erro! Ligue o carro antes de acelerar");
		}else {
			this.velocidade+=5;
		}
	}
	
	public void freiar() {
		if(this.ligado==false||this.velocidade==0) {
			System.out.println("Erro!Verifique se o carro esta parado ou desligado");
		}else {
			this.ligado=true;
			this.velocidade+=5;
		}
	}
	
//	3º Estado atual do objeto
	
	public void estado() {
		System.out.println("Cor: "+this.cor);
		System.out.println("Placa: "+this.placa);
		System.out.println("Ano: "+this.ano);
		System.out.println("O carro está ligado?"+this.ligado);
		System.out.println("A velocidade atual é: "+ this.velocidade+" KM/h");
	}
	
//	5º Método Construtor
//	Não possui tipo e deve ter o mesmo nome da classe molde
	
	public ResolucaoExercicio1Molde(String placa, int ano, String cor) {
		this.placa=placa;
		this.ano=ano;
		this.cor=cor;
	}
	
}
