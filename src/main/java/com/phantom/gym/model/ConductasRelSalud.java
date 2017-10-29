package com.phantom.gym.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class ConductasRelSalud {
	@Id
    @GeneratedValue
    private int idConductasRelSalud;
	private boolean dolorTorax;
	private boolean desmayos;
	private boolean faltaDeAireReposo;
	private boolean dolorCabezaFrecuente;
	private boolean problemasArticulaciones;
	private boolean problemasEspalda;
	private boolean problemasHuesos;
	private boolean problemaRodilla;
	private boolean problemaCadera;
	private String situacionFisica;
	
	@OneToOne
	@JoinColumn (name="idCliente")
	private Cliente cliente;
	
	public boolean isDolorTorax() {
		return dolorTorax;
	}
	public void setDolorTorax(boolean dolorTorax) {
		this.dolorTorax = dolorTorax;
	}
	public boolean isDesmayos() {
		return desmayos;
	}
	public void setDesmayos(boolean desmayos) {
		this.desmayos = desmayos;
	}
	public boolean isFaltaDeAireReposo() {
		return faltaDeAireReposo;
	}
	public void setFaltaDeAireReposo(boolean faltaDeAireReposo) {
		this.faltaDeAireReposo = faltaDeAireReposo;
	}
	public boolean isDolorCabezaFrecuente() {
		return dolorCabezaFrecuente;
	}
	public void setDolorCabezaFrecuente(boolean dolorCabezaFrecuente) {
		this.dolorCabezaFrecuente = dolorCabezaFrecuente;
	}
	public boolean isProblemasArticulaciones() {
		return problemasArticulaciones;
	}
	public void setProblemasArticulaciones(boolean problemasArticulaciones) {
		this.problemasArticulaciones = problemasArticulaciones;
	}
	public boolean isProblemasEspalda() {
		return problemasEspalda;
	}
	public void setProblemasEspalda(boolean problemasEspalda) {
		this.problemasEspalda = problemasEspalda;
	}
	public boolean isProblemasHuesos() {
		return problemasHuesos;
	}
	public void setProblemasHuesos(boolean problemasHuesos) {
		this.problemasHuesos = problemasHuesos;
	}
	public boolean isProblemaRodilla() {
		return problemaRodilla;
	}
	public void setProblemaRodilla(boolean problemaRodilla) {
		this.problemaRodilla = problemaRodilla;
	}
	public boolean isProblemaCadera() {
		return problemaCadera;
	}
	public void setProblemaCadera(boolean problemaCadera) {
		this.problemaCadera = problemaCadera;
	}
	public String getSituacionFisica() {
		return situacionFisica;
	}
	public void setSituacionFisica(String situacionFisica) {
		this.situacionFisica = situacionFisica;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}	
}