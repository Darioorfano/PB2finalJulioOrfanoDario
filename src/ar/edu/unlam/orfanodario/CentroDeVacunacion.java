package ar.edu.unlam.orfanodario;

import java.util.Set;
import java.util.TreeSet;

import ar.edu.unlam.orfanodario.comparators.OrdenPorDni;
import ar.edu.unlam.orfanodario.exceptions.NoCovidVaccineException;
import ar.edu.unlam.orfanodario.exceptions.NoMoreVaccineException;

public class CentroDeVacunacion {

private Set<Paciente>personasVacunadas;

public CentroDeVacunacion(){
	this.personasVacunadas=new TreeSet<>();
	
}

public void aplicarVacuna(Paciente paciente,Vacuna vacuna){
	
	try {
	paciente.vacunar(vacuna);

		
	}catch(NoMoreVaccineException e) {
		
		
	}catch (NoCovidVaccineException e) {
		
	}
	
}

public Set<Paciente> ordenarPlantelPorApellido(){
	Set<Paciente>pacientesOrdenadosPorDni=new TreeSet<>(new OrdenPorDni());
	pacientesOrdenadosPorDni.addAll(this.personasVacunadas);
	
	return pacientesOrdenadosPorDni;
}

}


