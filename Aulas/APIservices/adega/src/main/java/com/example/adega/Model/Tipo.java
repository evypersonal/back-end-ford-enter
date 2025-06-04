package com.example.adega.Model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tipo")
public class Tipo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String tipo;
	
	@OneToMany(mappedBy = "tipo", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("tipo")
	private List<Bebidas> bebidas;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Bebidas> getBebidas() {
		return bebidas;
	}

	public void setBebidas(List<Bebidas> bebidas) {
		this.bebidas = bebidas;
	}
	
	
	
}
