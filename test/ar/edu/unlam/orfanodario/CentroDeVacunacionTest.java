package ar.edu.unlam.orfanodario;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.exceptions.JugadorDuplicadoException;
import ar.edu.unlam.orfanodario.exceptions.NoMoreVaccineException;

public class CentroDeVacunacionTest {

	@Test (expected = NoMoreVaccineException.class)
	public void testQueVerificaQueElPacienteNoPuedeVacunarseConMasDeDosVacunasDistintas() {
	Paciente paciente =new Paciente("Dario", 41582343);
	CentroDeVacunacion centro=new CentroDeVacunacion();
	
	
	}

}
