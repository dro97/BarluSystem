package barlu.back.test.utils;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import barlu.back.test.beans.CartRequestBean;
import barlu.back.test.beans.ProductRequestBean;
import barlu.back.test.model.ProductRecordEO;
import barlu.back.test.model.ProductsEO;

public class ProductUtil {
	
	
	public static ProductsEO newProduct(ProductRequestBean request) {
		
		ProductsEO entidad = new ProductsEO();
		entidad.setProductCode(UUID.randomUUID().toString());
		entidad.setDescription(request.getDescription());
		entidad.setName(request.getName());
		entidad.setStock(Integer.parseInt(request.getQuantity()));
		entidad.setType(request.getType());
		entidad.setPrice(request.getPrice());
		
		return entidad;
		
	}
	
	public static ProductRecordEO newProductRecord(ProductsEO product,ProductRequestBean request) {
		
		ProductRecordEO entidad = new ProductRecordEO();
		
		entidad.setIn(Integer.parseInt(request.getQuantity()));
		
		if(request.getType().equals("S")) {
		
		entidad.setOut(0);
		entidad.setIn(0);
		}else {
			entidad.setIn(Integer.parseInt(request.getQuantity()));
		}
		
		entidad.setDate(Timestamp.from(Instant.now()));
		
		entidad.setProducts(product);
		
	
		
			
		return entidad;
	}
	
	public static List<String> listaProductCode(CartRequestBean request){
		
		
		List<String> respuesta = new ArrayList<String>() ;
		
		for(int c = 0;c<request.getProductcode().size();c++) {
			
			respuesta.set(c, request.getProductcode().get(c).getProductCode());
			
		}
		
		return respuesta;
		
	}
	
	public static ProductRecordEO conversion(ProductsEO request,String cart) {
		
		ProductRecordEO conversion   = new ProductRecordEO();
		
		//conversion.set
		
		
		
		return null;
	}
	

}
