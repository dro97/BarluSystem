/**
 * @author dro97
 *
 * 
 */
package barlu.back.test.model;

import java.sql.Date;
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
@Table(name = "cart")
@Entity
public class CartEO {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idcart")
	private long cartID;
	@Column(name = "idCliente")
	private int idCliente;
	@Column(name = "date")
	private Date date;
	@Column(name = "idUser")
	private int idUser;
	@Column(name = "total")
	private String total;
	@Column(name = "borrow")
	private String borrow;
	@OneToMany(mappedBy = "cart")
	private List<CartProductEO>  cartProduct;
	

	
	/**
	 * @return the cartID
	 */
	public long getCartID() {
		return cartID;
	}

	/**
	 * @param cartID the cartID to set
	 */
	public void setCartID(long cartID) {
		this.cartID = cartID;
	}

	/**
	 * @return the cartProduct
	 */
	public List<CartProductEO> getCartProduct() {
		return cartProduct;
	}

	/**
	 * @param cartProduct the cartProduct to set
	 */
	public void setCartProduct(List<CartProductEO> cartProduct) {
		this.cartProduct = cartProduct;
	}

	/**
	 * @return the idCliente
	 */
	public int getIdCliente() {
		return idCliente;
	}

	/**
	 * @param idCliente the idCliente to set
	 */
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the idUser
	 */
	public int getIdUser() {
		return idUser;
	}

	/**
	 * @param idUser the idUser to set
	 */
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	/**
	 * @return the total
	 */
	public String getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(String total) {
		this.total = total;
	}

	/**
	 * @return the borrow
	 */
	public String getBorrow() {
		return borrow;
	}

	/**
	 * @param borrow the borrow to set
	 */
	public void setBorrow(String borrow) {
		this.borrow = borrow;
	}
	
	
	

}
