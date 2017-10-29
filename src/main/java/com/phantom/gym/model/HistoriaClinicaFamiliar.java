package com.phantom.gym.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
@Entity
public class HistoriaClinicaFamiliar {

	@Id
    @GeneratedValue
    private int idHistoriaClinicaFamiliar;
	private boolean problemasCardiovasculares;
	private boolean hta;
	private boolean dm;
	private boolean dislipidemia;
	private boolean epilepsia;
	private boolean obesidad;
	private boolean osteoporosis;
	private boolean tiroides;
	@OneToOne
	@JoinColumn (name="idCliente")
	private Cliente cliente;
	
	public boolean isProblemasCardiovasculares() {
		return problemasCardiovasculares;
	}
	public void setProblemasCardiovasculares(boolean problemasCardiovasculares) {
		this.problemasCardiovasculares = problemasCardiovasculares;
	}
	public boolean isHta() {
		return hta;
	}
	public void setHta(boolean hta) {
		this.hta = hta;
	}
	public boolean isDm() {
		return dm;
	}
	public void setDm(boolean dm) {
		this.dm = dm;
	}
	public boolean isDislipidemia() {
		return dislipidemia;
	}
	public void setDislipidemia(boolean dislipidemia) {
		this.dislipidemia = dislipidemia;
	}
	public boolean isEpilepsia() {
		return epilepsia;
	}
	public void setEpilepsia(boolean epilepsia) {
		this.epilepsia = epilepsia;
	}
	public boolean isObesidad() {
		return obesidad;
	}
	public void setObesidad(boolean obesidad) {
		this.obesidad = obesidad;
	}
	public boolean isOsteoporosis() {
		return osteoporosis;
	}
	public void setOsteoporosis(boolean osteoporosis) {
		this.osteoporosis = osteoporosis;
	}
	public boolean isTiroides() {
		return tiroides;
	}
	public void setTiroides(boolean tiroides) {
		this.tiroides = tiroides;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}