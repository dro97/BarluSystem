/**
 * @author dro97
 *
 * 
 */
package barlu.back.test.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author dro97
 *
 */
@Table(name = "borrowclients")
@Entity
public class BorrowClients {
	
	

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idborrowcli")
	private long idBorrowClient;
	@Column(name = "idcliente")
	private long idCLient;
	@Column(name = "idcart")
	private long idCart;
	@Column(name = "status")
	private String status;
	@Column(name = "creation_date")
	private Date creationDate;
	@Column(name = "payout_date")
	private Date payoutDate;
	
	@ManyToOne
    @JoinColumn(name="idclient", nullable=false)
    private ClientEO client;

	/**
	 * @return the idBorrowClient
	 */
	public long getIdBorrowClient() {
		return idBorrowClient;
	}

	/**
	 * @param idBorrowClient the idBorrowClient to set
	 */
	public void setIdBorrowClient(long idBorrowClient) {
		this.idBorrowClient = idBorrowClient;
	}

	/**
	 * @return the idCLient
	 */
	public long getIdCLient() {
		return idCLient;
	}

	/**
	 * @param idCLient the idCLient to set
	 */
	public void setIdCLient(long idCLient) {
		this.idCLient = idCLient;
	}

	/**
	 * @return the idCart
	 */
	public long getIdCart() {
		return idCart;
	}

	/**
	 * @param idCart the idCart to set
	 */
	public void setIdCart(long idCart) {
		this.idCart = idCart;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the creationDate
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * @return the payoutDate
	 */
	public Date getPayoutDate() {
		return payoutDate;
	}

	/**
	 * @param payoutDate the payoutDate to set
	 */
	public void setPayoutDate(Date payoutDate) {
		this.payoutDate = payoutDate;
	}

	/**
	 * @return the client
	 */
	public ClientEO getClient() {
		return client;
	}

	/**
	 * @param client the client to set
	 */
	public void setClient(ClientEO client) {
		this.client = client;
	}


	
	

}
