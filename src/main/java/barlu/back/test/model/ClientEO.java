/**
 * @author dro97
 *
 * 
 */
package barlu.back.test.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author dro97
 *
 */
@Table(name = "client")
@Entity
public class ClientEO {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idclient")
	private Long idCliente;
	@Column(name = "name")
	private String name;
	@Column(name = "lastname")
	private String lastname;	
	@OneToMany(mappedBy = "client")
	private List<BorrowClients>  borrowClient;
	/**
	 * @return the idCliente
	 */
	public Long getIdCliente() {
		return idCliente;
	}
	/**
	 * @param idCliente the idCliente to set
	 */
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	/**
	 * @return the borrowClient
	 */
	public List<BorrowClients> getBorrowClient() {
		return borrowClient;
	}
	/**
	 * @param borrowClient the borrowClient to set
	 */
	public void setBorrowClient(List<BorrowClients> borrowClient) {
		this.borrowClient = borrowClient;
	}
	
	

}
