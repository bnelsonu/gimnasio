package com.phantom.gym.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Cliente {
	
	@Id
    @GeneratedValue
    private int id;
	private String nombre;
    private	String apellido1;
    private String apellido2;
    private String LugarTrabajo;
    private String correoPersonal;
    private boolean fumado;
    private boolean bebidasAlcoholicas;
    @Enumerated(EnumType.STRING)
    private EstiloVida estiloVida;
    
    @OneToMany(mappedBy="dieta")
	@JsonIgnore
	private Collection <Dieta> dietas = new ArrayList <Dieta> ();
    
    @OneToMany(mappedBy="actividadFisica")
  	@JsonIgnore
    private Collection <ActividadFisica> actividadesFisicas =  new ArrayList <ActividadFisica> ();
    
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getLugarTrabajo() {
		return LugarTrabajo;
	}
	public void setLugarTrabajo(String lugarTrabajo) {
		LugarTrabajo = lugarTrabajo;
	}
	public String getCorreoPersonal() {
		return correoPersonal;
	}
	public void setCorreoPersonal(String correoPersonal) {
		this.correoPersonal = correoPersonal;
	}
	public boolean isFumado() {
		return fumado;
	}
	public void setFumado(boolean fumado) {
		this.fumado = fumado;
	}
	public boolean isBebidasAlcoholicas() {
		return bebidasAlcoholicas;
	}
	public void setBebidasAlcoholicas(boolean bebidasAlcoholicas) {
		this.bebidasAlcoholicas = bebidasAlcoholicas;
	}
	public EstiloVida getEstiloVida() {
		return estiloVida;
	}
	public void setEstiloVida(EstiloVida estiloVida) {
		this.estiloVida = estiloVida;
	}
	public Collection<Dieta> getDietas() {
		return dietas;
	}
	public void setDietas(Collection<Dieta> dietas) {
		this.dietas = dietas;
	}
	public Collection<ActividadFisica> getActividadesFisicas() {
		return actividadesFisicas;
	}
	public void setActividadesFisicas(Collection<ActividadFisica> actividadesFisicas) {
		this.actividadesFisicas = actividadesFisicas;
	}
}