package com.phantom.gym.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class Suplemento {
	
	@Id
    @GeneratedValue
    private int idSuplemento;
	private String nombre;
	
	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinTable(name = "suplemento_cliente", joinColumns = { @JoinColumn(name = "idSuplemento") }, 
	inverseJoinColumns = { @JoinColumn(name = "idCliente") })
	private Collection <Cliente> clientes = new ArrayList <Cliente> ();
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Collection<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(Collection<Cliente> clientes) {
		this.clientes = clientes;
	}
}