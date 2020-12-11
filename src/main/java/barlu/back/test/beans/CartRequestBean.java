/**
 * @author dro97
 *
 * 
 */
package barlu.back.test.beans;

import java.util.List;

/**
 * @author dro97
 *
 */
public class CartRequestBean {
	
	private String cartid;
	
	private List<ProductCartBean> productcode;
	
	private String borrow;
	
	
	

	public String getBorrow() {
		return borrow;
	}

	public void setBorrow(String borrow) {
		this.borrow = borrow;
	}

	public String getCartid() {
		return cartid;
	}

	public void setCartid(String cartid) {
		this.cartid = cartid;
	}

	public List<ProductCartBean> getProductcode() {
		return productcode;
	}

	public void setProductcode(List<ProductCartBean> productcode) {
		this.productcode = productcode;
	}


	
	
	

}
