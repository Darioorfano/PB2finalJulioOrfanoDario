package ar.edu.unlam.orfanodario;

import java.util.Set;
import java.util.TreeSet;

public class CentroDeVacunacion {

private Set<Paciente>personasVacunadas;

public CentroDeVacunacion(){
	this.personasVacunadas=new TreeSet<>();
	
}

public Boolean aplicarVacuna(Paciente paciente){
	
	
	this.personasVacunadas.add(paciente);
}


}
