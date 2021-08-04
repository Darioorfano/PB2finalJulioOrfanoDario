package ar.edu.unlam.orfanodario;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unlam.orfanodario.exceptions.NoCovidVaccineException;
import ar.edu.unlam.orfanodario.exceptions.NoMoreVaccineException;

public class Paciente implements Comparable<Paciente> {

	private String nombre;
	private Integer dni;
	private Boolean tuvoRubeola;
	private Boolean tuvoHepatitis;
	private List<Vacuna> vacunasAplicadas;

	public Paciente(String nombre, Integer dni) {
		this.nombre = nombre;
		this.dni = dni;
		this.vacunasAplicadas = new ArrayList<>();
		this.tuvoRubeola = false;
		this.tuvoHepatitis = false;
	}

	
	public void vacunar(Vacuna vacuna) throws NoCovidVaccineException, NoMoreVaccineException {

		if (!this.vacunasAplicadas.contains(vacuna)) {
			if (vacuna instanceof Rubeola) {

				if (!this.tuvoRubeola) {

					this.vacunasAplicadas.add(vacuna);
				}

			} else if (vacuna instanceof HepatitisA || vacuna instanceof HepatitisB || vacuna instanceof HepatitisC) {

				if (!this.tuvoHepatitis) {

					this.vacunasAplicadas.add(vacuna);
				}
			} else if (vacuna instanceof Covid19SegundaDosis) {
				Boolean vacunaEncontradaPrimerDosis = false;
				for (Vacuna vacunaPrimerDosis : vacunasAplicadas) {
					if (vacunaPrimerDosis instanceof Covid19PrimerDosis) {

						vacunaEncontradaPrimerDosis = true;
					}else {
						throw new NoCovidVaccineException();

						
					}
				}
				if (!vacunaEncontradaPrimerDosis) {

					this.vacunasAplicadas.add(vacuna);
				}

			}else {
				this.vacunasAplicadas.add(vacuna);	
			}

		}else {
			
			throw new NoMoreVaccineException();
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


	@Override
	public int compareTo(Paciente o) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(o.getNombre());
	}

}
