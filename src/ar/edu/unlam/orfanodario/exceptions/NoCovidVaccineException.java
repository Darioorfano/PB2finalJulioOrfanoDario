package ar.edu.unlam.orfanodario.exceptions;

public class NoCovidVaccineException extends Exception{

	public NoCovidVaccineException(){
		super("No puede darse mas de 2 vacunas");
		
	}
}
