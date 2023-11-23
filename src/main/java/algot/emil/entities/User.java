package algot.emil.entities;

import algot.emil.enums.UserPrivilege;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.List;

/**
 * Note: This class must be called AppUser instead of App because of name clash. Program will not compile otherwise
 */

@Entity
public class User extends BaseEntity {


	@Column
	private UserPrivilege privilege;
	@Column(unique = true) // Detta gör email-kolumnen unik i databasen
	private String email;
	private String password;

	@OneToOne(mappedBy = "user")
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
