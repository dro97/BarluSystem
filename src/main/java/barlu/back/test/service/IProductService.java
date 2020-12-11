/**
 * @author dro97
 *
 * 
 */
package barlu.back.test.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;

import barlu.back.test.beans.CartRequestBean;
import barlu.back.test.beans.ProductRequestBean;
import barlu.back.test.beans.ResponseBean;

/**
 * @author dro97
 *
 */
public interface IProductService {

	ResponseEntity<ResponseBean> addProduct(ProductRequestBean request,HttpServletRequest data);
	
	
	ResponseEntity<ResponseBean> cartOperation(CartRequestBean request,HttpServletRequest data);
	
	
	ResponseEntity<ResponseBean> updateProduct(CartRequestBean request,HttpServletRequest data,String cart);
	
	
}
