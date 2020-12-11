package barlu.back.test.utils;

import barlu.back.test.model.CartEO;
import barlu.back.test.model.CartProductEO;

public class CartProdUtil {
	
	public static CartProductEO llenarEntidad(CartEO cart,int idProd,int quantity) {
		
		CartProductEO entidad =new CartProductEO();
		
		entidad.setProductID(idProd);
		entidad.setQuantity(quantity);
		entidad.setCart(cart);
		
		return entidad;
		
	}

}
