package ar.edu.unlam.orfanodario.comparators;

import java.util.Comparator;

import ar.edu.unlam.orfanodario.Paciente;

public class OrdenPorDni implements Comparator<Paciente> {

	@Override
	public int compare(Paciente o1, Paciente o2) {
		// TODO Auto-generated method stub
		return o1.getDni().compareTo(o2.getDni());
	}

}
