package algot.emil.entities;

import algot.emil.enums.UserPrivilege;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

/**
 * Note: This class must be called AppUser instead of App because of name clash. Program will not compile otherwise
 */

@Entity
@Table(name = "app_user")
public class User extends BaseEntity {

	@Column
	private UserPrivilege privilege;
	@Column(unique = true) // Detta gör email-kolumnen unik i databasen
	private String email;
	private String password;

	@OneToOne
	@JsonIgnoreProperties("user")
	private Person person;

	//@OneToMany
	//private List<Message> messages;

	public User(UserPrivilege privilege, String email, String password) {
		this.privilege = privilege;
		this.email = email;
		this.password = password;
	}

	public User() {
	}

	public UserPrivilege getPrivilege() {
		return privilege;
	}

	public Person getPerson(){
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public void setPrivilege(UserPrivilege privilege) {
		this.privilege = privilege;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AppUser{" +
				"privilege=" + privilege +
				", email='" + email + '\'' +
				", password='" + password + '\'' +
				//", messages=" + messages +
				'}';
	}
}
