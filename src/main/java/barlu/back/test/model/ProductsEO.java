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
@Table(name = "products")
@Entity
public class ProductsEO {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idproducts")
	private Long idProducts;
	@Column(name = "productcode")
	private String productCode;
	@Column(name = "provider")
	private int provider;
	@Column(name = "description")
	private String description;
	@Column(name = "stock")
	private int stock;
	@Column(name = "type")
	private String type;
	@Column(name = "name")
	private String name;
	@Column(name = "price")
	private String price;
	@OneToMany(mappedBy = "products")
	private List<ProductRecordEO>  cartProduct;
	



	/**
	 * @return the cartProduct
	 */
	public List<ProductRecordEO> getCartProduct() {
		return cartProduct;
	}

	/**
	 * @param cartProduct the cartProduct to set
	 */
	public void setCartProduct(List<ProductRecordEO> cartProduct) {
		this.cartProduct = cartProduct;
	}

	/**
	 * @return the idProducts
	 */
	public Long getIdProducts() {
		return idProducts;
	}

	/**
	 * @param idProducts the idProducts to set
	 */
	public void setIdProducts(Long idProducts) {
		this.idProducts = idProducts;
	}

	/**
	 * @return the productCode
	 */
	public String getProductCode() {
		return productCode;
	}

	/**
	 * @param productCode the productCode to set
	 */
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	/**
	 * @return the provider
	 */
	public int getProvider() {
		return provider;
	}

	/**
	 * @param provider the provider to set
	 */
	public void setProvider(int provider) {
		this.provider = provider;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the stock
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * @param stock the stock to set
	 */
	public void setStock(int stock) {
		this.stock = stock;
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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	
	
	
	

}
