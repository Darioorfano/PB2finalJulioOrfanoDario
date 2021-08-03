package ar.edu.unlam.orfanodario;

import java.util.ArrayList;
import java.util.List;

public class Paciente {

	private String nombre;
	private Integer dni;
	private List<Vacuna>vacunasAplicadas;
	
	public Paciente(String nombre,Integer dni) {
		this.nombre=nombre;
		this.dni=dni;
		this.vacunasAplicadas=new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}
	


}
