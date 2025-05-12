package Encapsulamento;

// class ModeloTelogio está implementando a interface InterRelogio
public class ModeloRelogio implements InterRelogio{
//	Atributos do modelo
	private int hora;
	private int minuto;
	private boolean despertador;
	
	@Override
	public void ajustarHora(int h) {
		if(h>=0 && h<=23)
			this.hora=h;
		else
			System.out.println("Erro! Hora inválida!");
	}
	@Override
	public void ajustarMin(int m) {
		if(m>=0 && m<=59)
			this.minuto=m;
		else
			System.out.println("Erro! Minutos inválidos!");
		
	}
	@Override
	public void despertar() {
		if(this.despertador==true) {
			this.despertador=false;
		}else {
			this.despertador=true;
		}
		
	}
	
//	Método get, pois não será necessário o usuario alterar as informações dos métodos já passadas.
	
	public int getHora() {
		return hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public boolean getDespertador() {
		return despertador;
	}
	
	
}
