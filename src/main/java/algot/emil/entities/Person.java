package algot.emil.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
public abstract class Person extends BaseEntity {

	private String firstName;
	private String LastName;

	@OneToOne(mappedBy = "person")
	private User user;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}
}
