package algot.emil.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;
@Entity
public class Note extends BaseEntity {

	private LocalDate dateWritten;
	private String noteText;

	@ManyToOne
	private Staff writtenBy;

	@ManyToOne
	private Patient patient;

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public LocalDate getDateWritten() {
		return dateWritten;
	}

	public void setDateWritten(LocalDate dateWritten) {
		this.dateWritten = dateWritten;
	}

	public String getNoteText() {
		return noteText;
	}

	public void setNoteText(String noteText) {
		this.noteText = noteText;
	}

	public Staff getWrittenBy() {
		return writtenBy;
	}

	public void setWrittenBy(Staff writtenBy) {
		this.writtenBy = writtenBy;
	}
}
