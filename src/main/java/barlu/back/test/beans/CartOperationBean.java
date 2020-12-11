/**
 * @author dro97
 *
 * 
 */
package barlu.back.test.beans;

import java.util.List;

import barlu.back.test.model.ProductsEO;

/**
 * @author dro97
 *
 */
public class CartOperationBean {
	
	private long cartid;
	
	private List<ProductsEO> productos;

	public long getCartid() {
		return cartid;
	}

	public void setCartid(long cartid) {
		this.cartid = cartid;
	}

	public List<ProductsEO> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductsEO> productos) {
		this.productos = productos;
	} 
	
	

}
