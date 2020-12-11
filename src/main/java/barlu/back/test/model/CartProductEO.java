/**
 * @author dro97
 *
 * 
 */
package barlu.back.test.model;

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
@Table(name = "cart_product")
@Entity
public class CartProductEO {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idcartprod")
	private long idcartprod;
	@Column(name = "product_id")
	private int productID;
	@Column(name = "quantity")
	private int quantity;
	@ManyToOne
    @JoinColumn(name="idcart", nullable=false)
    private CartEO cart;

	/**
	 * @return the idcartprod
	 */
	public long getIdcartprod() {
		return idcartprod;
	}

	/**
	 * @param idcartprod the idcartprod to set
	 */
	public void setIdcartprod(long idcartprod) {
		this.idcartprod = idcartprod;
	}


	/**
	 * @return the productID
	 */
	public int getProductID() {
		return productID;
	}

	/**
	 * @param productID the productID to set
	 */
	public void setProductID(int productID) {
		this.productID = productID;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public CartEO getCart() {
		return cart;
	}

	public void setCart(CartEO cart) {
		this.cart = cart;
	}
	
	
	
	
	
	

}
