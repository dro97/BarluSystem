/**
 * @author dro97
 *
 * 
 */
package barlu.back.test.model;

import java.sql.Timestamp;

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
@Table(name = "productrecord")
@Entity
public class ProductRecordEO {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idproductrecord")
	private Long id;
	@Column(name = "movementdate")
	private Timestamp date;
	@Column(name = "ingress")
	private int in;
	@Column(name = "lose")
	private int out;
	 @ManyToOne(optional = true)
	    @JoinColumn(name="idprocut")
	    private ProductsEO products;
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	public int getIn() {
		return in;
	}
	public void setIn(int in) {
		this.in = in;
	}
	public int getOut() {
		return out;
	}
	public void setOut(int out) {
		this.out = out;
	}
	public ProductsEO getProducts() {
		return products;
	}
	public void setProducts(ProductsEO products) {
		this.products = products;
	}
	
	

	
	
}
