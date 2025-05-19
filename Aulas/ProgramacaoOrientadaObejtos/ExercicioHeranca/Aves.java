package ExercicioHeranca;

public class Aves extends Animal{
	private String habitat;
	private String bico;
	private boolean pena;
	private boolean migratório;
	private boolean quilha;
	
	public void voar() {
		if(this.pena==true && this.quilha==true) {
			this.habitat="Voador";
		}else {
			this.habitat="Terrestre ou aquático";
		}
	}

	public String getHabitat() {
		return habitat;
	}

	public String getBico() {
		return bico;
	}

	public boolean getPena() {
		return pena;
	}

	public boolean getMigratório() {
		return migratório;
	}

	public boolean getQuilha() {
		return quilha;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public void setBico(String bico) {
		this.bico = bico;
	}

	public void setPena(boolean pena) {
		this.pena = pena;
	}

	public void setMigratório(boolean migratório) {
		this.migratório = migratório;
	}

	public void setQuilha(boolean quilha) {
		this.quilha = quilha;
	}
	
	

}
