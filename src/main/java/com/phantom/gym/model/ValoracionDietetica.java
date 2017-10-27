package com.phantom.gym.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ValoracionDietetica {

	
	private String preparadorAlimentos;
	
	@OneToMany(mappedBy="alimentosPreferido")
	@JsonIgnore
	private Collection <AlimentosPreferidos> alimentosPreferidos = new ArrayList <AlimentosPreferidos> ();
	
	@OneToMany(mappedBy="alimentosNoConsumido")
	@JsonIgnore
	private Collection <AlimentosNoConsumidos> alimentosNoConsumidos = new ArrayList <AlimentosNoConsumidos> ();

	public String getPreparadorAlimentos() {
		return preparadorAlimentos;
	}

	public void setPreparadorAlimentos(String preparadorAlimentos) {
		this.preparadorAlimentos = preparadorAlimentos;
	}

	public Collection<AlimentosPreferidos> getAlimentosPreferidos() {
		return alimentosPreferidos;
	}

	public void setAlimentosPreferidos(Collection<AlimentosPreferidos> alimentosPreferidos) {
		this.alimentosPreferidos = alimentosPreferidos;
	}

	public Collection<AlimentosNoConsumidos> getAlimentosNoConsumidos() {
		return alimentosNoConsumidos;
	}

	public void setAlimentosNoConsumidos(Collection<AlimentosNoConsumidos> alimentosNoConsumidos) {
		this.alimentosNoConsumidos = alimentosNoConsumidos;
	}
}