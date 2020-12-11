/**
 * @author dro97
 *
 * 
 */
package barlu.back.test.utils;

import java.sql.Date;
import java.time.Instant;
import barlu.back.test.beans.CartRequestBean;
import barlu.back.test.model.CartEO;

/**
 * @author dro97
 *
 */
public class CartUtil {
	
	public static CartEO llenarEntidad (CartRequestBean request,String total) {
		
		CartEO entidad = new CartEO();
		
		entidad.setIdCliente(1);
		entidad.setBorrow(request.getBorrow());
		entidad.setDate(Date.valueOf(Instant.now().toString()));
		entidad.setIdUser(1);
		
		entidad.setTotal(total);
		
		
		return entidad;
	}

}
