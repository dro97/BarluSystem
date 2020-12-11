/**
 * 
 */
package barlu.back.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/***
 * 
 * @author dro97
 *
 */
@Table(name = "users")
@Entity
public class UsersEO {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idusers")
	private long idUSers;
	@Column(name = "type")
	private String type;
	@Column(name = "username")
	private String username; 
	@Column(name = "password")
	private String password;

	/**
	 * @return the idUSers
	 */
	public long getIdUSers() {
		return idUSers;
	}

	/**
	 * @param idUSers the idUSers to set
	 */
	public void setIdUSers(long idUSers) {
		this.idUSers = idUSers;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
