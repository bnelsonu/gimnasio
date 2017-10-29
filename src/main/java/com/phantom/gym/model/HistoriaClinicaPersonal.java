package com.phantom.gym.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
@Entity
public class HistoriaClinicaPersonal {
	@Id
    @GeneratedValue
    private int idHistoriaClinicaPersonal;
	private boolean herniaHiatal;
	private boolean ciclosMestruales;
	private boolean alergias_Intolerancia;
	private boolean dislipidemia;
	private boolean acidoUrico;
	private boolean retieneLiquidos;
	private boolean cefaleas;
	private boolean estrenimiento;
	private boolean diarreas;
	private boolean hemorroides;
	private boolean gastritis;
	private boolean tiroides;
	private boolean rinones;
    private String otros;
    @OneToOne
	@JoinColumn (name="idCliente")
	private Cliente cliente;
    
	public boolean isHerniaHiatal() {
		return herniaHiatal;
	}
	public void setHerniaHiatal(boolean herniaHiatal) {
		this.herniaHiatal = herniaHiatal;
	}
	public boolean isCiclosMestruales() {
		return ciclosMestruales;
	}
	public void setCiclosMestruales(boolean ciclosMestruales) {
		this.ciclosMestruales = ciclosMestruales;
	}
	public boolean isAlergias_Intolerancia() {
		return alergias_Intolerancia;
	}
	public void setAlergias_Intolerancia(boolean alergias_Intolerancia) {
		this.alergias_Intolerancia = alergias_Intolerancia;
	}
	public boolean isDislipidemia() {
		return dislipidemia;
	}
	public void setDislipidemia(boolean dislipidemia) {
		this.dislipidemia = dislipidemia;
	}
	public boolean isAcidoUrico() {
		return acidoUrico;
	}
	public void setAcidoUrico(boolean acidoUrico) {
		this.acidoUrico = acidoUrico;
	}
	public boolean isRetieneLiquidos() {
		return retieneLiquidos;
	}
	public void setRetieneLiquidos(boolean retieneLiquidos) {
		this.retieneLiquidos = retieneLiquidos;
	}
	public boolean isCefaleas() {
		return cefaleas;
	}
	public void setCefaleas(boolean cefaleas) {
		this.cefaleas = cefaleas;
	}
	public boolean isEstrenimiento() {
		return estrenimiento;
	}
	public void setEstrenimiento(boolean estrenimiento) {
		this.estrenimiento = estrenimiento;
	}
	public boolean isDiarreas() {
		return diarreas;
	}
	public void setDiarreas(boolean diarreas) {
		this.diarreas = diarreas;
	}
	public boolean isHemorroides() {
		return hemorroides;
	}
	public void setHemorroides(boolean hemorroides) {
		this.hemorroides = hemorroides;
	}
	public boolean isGastritis() {
		return gastritis;
	}
	public void setGastritis(boolean gastritis) {
		this.gastritis = gastritis;
	}
	public boolean isTiroides() {
		return tiroides;
	}
	public void setTiroides(boolean tiroides) {
		this.tiroides = tiroides;
	}
	public boolean isRinones() {
		return rinones;
	}
	public void setRinones(boolean rinones) {
		this.rinones = rinones;
	}
	public String getOtros() {
		return otros;
	}
	public void setOtros(String otros) {
		this.otros = otros;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}