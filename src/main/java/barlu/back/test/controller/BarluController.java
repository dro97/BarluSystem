/**
 * @author dro97
 *
 * 
 */
package barlu.back.test.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import barlu.back.test.beans.ProductRequestBean;
import barlu.back.test.beans.ResponseBean;
import barlu.back.test.service.IProductService;

/**
 * @author dro97
 *
 */
@RestController
@RequestMapping("/barlu")
public class BarluController {
	
	@Autowired
	private IProductService productService;
	
	
	@RequestMapping(value = "/new_product",method = RequestMethod.POST)
	public ResponseEntity<ResponseBean> nuevoProducto(@RequestBody ProductRequestBean requestbean,final  HttpServletRequest request) throws Exception{

	
		
		return productService.addProduct(requestbean, request);
	}
	
	
}
