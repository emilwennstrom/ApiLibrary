package algot.emil.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Staff extends Person {

	@OneToMany(mappedBy = "writtenBy", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Note> notes;

	public List<Note> getNotes() {
		return notes;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}

}
