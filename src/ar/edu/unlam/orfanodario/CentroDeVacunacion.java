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

public void aplicarVacuna(Paciente paciente,Vacuna vacuna) throws NoCovidVaccineException, NoMoreVaccineException{
	
	try {
	paciente.vacunar(vacuna);

		
	}catch(NoMoreVaccineException e) {
		throw e;
		
	}catch (NoCovidVaccineException e) {
		throw e;
	}
	
}

public Set<Paciente> ordenarPacientesPorDni(){
	Set<Paciente>pacientesOrdenadosPorDni=new TreeSet<>(new OrdenPorDni());
	pacientesOrdenadosPorDni.addAll(this.personasVacunadas);
	
	return pacientesOrdenadosPorDni;
}

}


