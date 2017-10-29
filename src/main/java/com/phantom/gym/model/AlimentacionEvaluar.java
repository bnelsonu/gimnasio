package com.phantom.gym.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class AlimentacionEvaluar {
	@Id
    @GeneratedValue
    private int idAlimentacionEvaluar;
	private String desayuno;
	private String meriendaManana;
	private String almuerzo;
	private String meriendaTarde;
	private String cena;
	private String colacionNocturna;
	private String consumoComidasRapidas;
	private String hidratacion;
	@OneToOne
	@JoinColumn (name="idCliente")
	private Cliente cliente;
	
	public String getDesayuno() {
		return desayuno;
	}
	public void setDesayuno(String desayuno) {
		this.desayuno = desayuno;
	}
	public String getMeriendaManana() {
		return meriendaManana;
	}
	public void setMeriendaManana(String meriendaManana) {
		this.meriendaManana = meriendaManana;
	}
	public String getAlmuerzo() {
		return almuerzo;
	}
	public void setAlmuerzo(String almuerzo) {
		this.almuerzo = almuerzo;
	}
	public String getMeriendaTarde() {
		return meriendaTarde;
	}
	public void setMeriendaTarde(String meriendaTarde) {
		this.meriendaTarde = meriendaTarde;
	}
	public String getCena() {
		return cena;
	}
	public void setCena(String cena) {
		this.cena = cena;
	}
	public String getColacionNocturna() {
		return colacionNocturna;
	}
	public void setColacionNocturna(String colacionNocturna) {
		this.colacionNocturna = colacionNocturna;
	}
	public String getConsumoComidasRapidas() {
		return consumoComidasRapidas;
	}
	public void setConsumoComidasRapidas(String consumoComidasRapidas) {
		this.consumoComidasRapidas = consumoComidasRapidas;
	}
	public String getHidratacion() {
		return hidratacion;
	}
	public void setHidratacion(String hidratacion) {
		this.hidratacion = hidratacion;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}