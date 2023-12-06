package algot.emil.entities;

import algot.emil.enums.EncounterStatus;
import algot.emil.enums.EncounterPriority;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;
import java.util.Date;


@Entity
public class Encounter extends BaseEntity {

	private EncounterStatus status;
	private EncounterPriority priority;

	private String reason;

	@ManyToOne
	private Doctor doctor;

	@ManyToOne
	private Patient patient;

	private LocalDate date;

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public EncounterStatus getStatus() {
		return status;
	}

	public void setStatus(EncounterStatus status) {
		this.status = status;
	}

	public EncounterPriority getPriority() {
		return priority;
	}

	public void setPriority(EncounterPriority priority) {
		this.priority = priority;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}


	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
}
