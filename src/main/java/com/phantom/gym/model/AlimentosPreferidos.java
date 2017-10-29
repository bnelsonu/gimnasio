package com.phantom.gym.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class AlimentosPreferidos {

	@Id
    @GeneratedValue
    private int idAlimentosPreferidos;
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="idValoracionDietetica")
	ValoracionDietetica valoracionDietetica;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ValoracionDietetica getValoracionDietetica() {
		return valoracionDietetica;
	}
	public void setValoracionDietetica(ValoracionDietetica valoracionDietetica) {
		this.valoracionDietetica = valoracionDietetica;
	}	
}