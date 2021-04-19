package com.sinfloo.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "persona")

public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String nombre;
private String direccion;
private String telefono;

public Persona() {
	//TODO Auto-generated constructor stub
	
}

public Persona(int id, String nombre, String direccion , String telefono) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.direccion= direccion;
	this.telefono = telefono;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}

public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}


}


