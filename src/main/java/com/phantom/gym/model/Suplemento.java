package com.phantom.gym.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Suplemento {
	
	@Id
    @GeneratedValue
    private int id;
	private String nombre;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}