package ar.edu.unlam.orfanodario;

import java.util.ArrayList;
import java.util.List;

public class Paciente{

	private String nombre;
	private Integer dni;
	private Boolean tuvoRubeola;
	private Boolean tuvoHepatitis;
	private List<Vacuna>vacunasAplicadas;
	
	public Paciente(String nombre,Integer dni) {
		this.nombre=nombre;
		this.dni=dni;
		this.vacunasAplicadas=new ArrayList<>();
		this.tuvoRubeola=false;
	this.tuvoHepatitis=false;
	}

	public void vacunar(Vacuna vacuna){
	
		if(!this.vacunasAplicadas.contains(vacuna)) {
		if(vacuna instanceof Rubeola) {
			
			if(!this.tuvoRubeola){
				
				this.vacunasAplicadas.add(vacuna);
			}
			
		}
		if(vacuna instanceof HepatitisA || vacuna instanceof HepatitisB
		||vacuna instanceof HepatitisC){
			
			if(!this.tuvoHepatitis){
				
				this.vacunasAplicadas.add(vacuna);
			}
		}
		
		if(vacuna instanceof Covid19SegundaDosis) {
			Boolean vacunaEncontradaPrimerDosis=false;
			for (Vacuna vacunaPrimerDosis : vacunasAplicadas) {
				if(vacunaPrimerDosis instanceof Covid19PrimerDosis) {
					
				vacunaEncontradaPrimerDosis=true;
				}
			}
		}
		
		}
		
		
		
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
