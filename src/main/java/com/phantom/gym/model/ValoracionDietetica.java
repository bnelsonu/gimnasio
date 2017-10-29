package com.phantom.gym.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class ValoracionDietetica {

	@Id
    @GeneratedValue
    private int idValoracionDietetica;
	private String preparadorAlimentos;
	
	@OneToMany(mappedBy="valoracionDietetica")
	@JsonIgnore
	private Collection <AlimentosPreferidos> alimentosPreferidos = new ArrayList <AlimentosPreferidos> ();
	
	@OneToMany(mappedBy="valoracionDietetica")
	@JsonIgnore
	private Collection <AlimentosNoConsumidos> alimentosNoConsumidos = new ArrayList <AlimentosNoConsumidos> ();

	@OneToOne
	@JoinColumn (name="idCliente")
	private Cliente cliente;
	
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