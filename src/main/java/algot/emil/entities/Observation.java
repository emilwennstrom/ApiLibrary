package algot.emil.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
@Entity
public class Observation extends BaseEntity {
	private String description;
	private Double value;
	private String unit;

	@ManyToOne
	private Patient patient;

	public Observation(String description, double value, String unit, Patient patient) {
		this.description = description;
		this.value = value;
		this.unit = unit;
		this.patient = patient;
	}

	public Observation() {

	}


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
}
