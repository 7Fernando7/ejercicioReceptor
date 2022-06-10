package com.neoris.ejercicioReceptor.modelo.entities;

import lombok.Data;

@Data
public class Usuario {

	private int id;
	private String nombre;
	private String apellidos;
	private String email;
	private String dni;
	private String observaciones;
}
