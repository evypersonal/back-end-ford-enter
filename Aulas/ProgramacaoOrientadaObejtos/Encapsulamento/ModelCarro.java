package Encapsulamento;

public class ModelCarro implements InterCarro,InterRadio {
	
	private boolean ligado;
	private int vol;
	private double estacao;
	private String frequencia;
	private int velocidade;
	private int marchaAtual;
//	private int qtdMarcha;
//	private String posicao;
	

	@Override
	public void volMais() {
		if(ligado == true && vol ==0 && vol<=20) {
			vol++;
		}else {
			System.out.println("Verifique se o rádio está ligado e o volume está abaixo de 20!");
		}
		
	}

	@Override
	public void volMenos() {
		if(ligado == true && vol>0) {
			vol--;
		}else {
			System.out.println("Verifique se o rádio está ligado e se o volume está acima de 0!");
		}
		
	}

	@Override
	public void estacao() {
		this.estacao+=0.10;
		
	}

	@Override
	public void frequencia() {
		if(this.frequencia=="AM")
			this.frequencia="FM";
		else
			this.frequencia="AM";
		
	}

	@Override
	public void ligar() {
		if(this.marchaAtual==0 && this.velocidade==0 && this.ligado==false) {
			System.out.println("Carro está ligado, pode acelerar se quiser!");
			this.ligado=true;
		}else {
			System.out.println("Verifique se a marcha está engatada, a velocidade ou se já está ligado!");
		}
		
	}

	@Override
	public void desligar() {
		if(this.ligado == true && this.velocidade==0) {
			this.ligado = false;
		}else {
			System.out.println("Verifique se o carro já está desligado, ou pare o carro antes, para desligar!");
		}
		
	}

	@Override
	public void acelerar() {
		if(this.ligado==true && this.marchaAtual>0 && this.velocidade<=190) {
			System.out.println("Você está acelerando!");
			this.velocidade+=10;
		}else {
			System.out.println("É necessário ligar o carro e engatar a marcha para poder acelerar!");
		}
		
	}

	@Override
	public void frear() {
		if(this.ligado==true && this.velocidade > 0) {
			System.out.println("Você está freiando!");
			this.velocidade-=10;
		}else {
			System.out.println("Verifique se o carro está ligado ou em movimento para que possa freiar!");
		}
		
	}
	
//	@Override
//	public void trocarMarcha() {
//		if(this.ligado==true && this.marchaAtual==0 && this.posicao=="R") {
//			this.marchaAtual=-1;
//		}else if(this.ligado==true && this.marchaAtual==-1 && this.posicao=="N" && this.velocidade==0) {
//			this.marchaAtual=0;
//		}else if(this.ligado==true && this.marchaAtual==0 && this.posicao=="D" && this.velocidade) {
//			
//		}
//	}

	public boolean getLigado() {
		return ligado;
	}

	public int getVol() {
		return vol;
	}

	public double getEstacao() {
		return estacao;
	}

	public String getFrequencia() {
		return frequencia;
	}

	public int getVelocidade() {
		return velocidade;
	}
	
	
}


// 1º criar interface para o objeto e implementar na classe;
// 2º criar atribuitos para o objeto;
// 3º adicionar ação aos métodos da interface;
// 4º Criar os getter e setters;
// 5º Instanciar o objeto;
// 6º Imprimir estado atual do objeto instanciado
// 7º Acrescentar valores ao objeto
// 8º Imprimir novo estado do objeto
