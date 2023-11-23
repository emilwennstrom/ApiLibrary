package algot.emil.entities;


import jakarta.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Staff extends NamedEntity {

	@OneToMany(mappedBy = "writtenBy", fetch = FetchType.LAZY)
	private List<Note> notes;

	public List<Note> getNotes() {
		return notes;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}

}
