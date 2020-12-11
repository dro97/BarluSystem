/**
 * @author dro97
 *
 * 
 */
package barlu.back.test.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import barlu.back.test.beans.CartRequestBean;
import barlu.back.test.beans.GeneralBean;
import barlu.back.test.beans.ProductRequestBean;
import barlu.back.test.beans.ResponseBean;
import barlu.back.test.model.CartEO;
import barlu.back.test.model.ProductRecordEO;
import barlu.back.test.model.ProductsEO;
import barlu.back.test.repository.ICartProdRepository;
import barlu.back.test.repository.ICartRepository;
import barlu.back.test.repository.IProductRecordRepository;
import barlu.back.test.repository.IProductRepository;
import barlu.back.test.utils.CartProdUtil;
import barlu.back.test.utils.CartUtil;
import barlu.back.test.utils.ProductUtil;

/**
 * @author dro97
 *
 */
@Service
public class ProductService implements IProductService {

@Autowired
private IProductRepository productRepo;
@Autowired
private IProductRecordRepository productRecordRepo;
@Autowired
private ICartRepository cartRepo;
@Autowired
private ICartProdRepository cartProdRepo;
	
	@Override
	public ResponseEntity<ResponseBean> addProduct(ProductRequestBean request, HttpServletRequest data) {
		
		
		ResponseEntity<ResponseBean> response  = null;
		
		ResponseBean respuesta = new ResponseBean();
		
		ProductsEO newProduct = new ProductsEO();
		
		ProductRecordEO newRecordProduct = new ProductRecordEO();
		
		newProduct = productRepo.saveAndFlush(ProductUtil.newProduct(request));
		
				
		newRecordProduct = ProductUtil.newProductRecord(newProduct,request);		
		
		
		productRecordRepo.saveAndFlush(newRecordProduct);			
		
		
		respuesta.setCode("COD00");
		
		respuesta.setMsgError("Producto Agregado Correctamente");
		
		
		response = new ResponseEntity<ResponseBean>(respuesta,HttpStatus.OK);
		
		
		return response;
	}

	@Override
	public ResponseEntity<ResponseBean> cartOperation(CartRequestBean request, HttpServletRequest data) {
		
		GeneralBean productOperation = new GeneralBean();
		productOperation = productOperation(request,data);	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		return null;
	}
	
	
	private GeneralBean productOperation(CartRequestBean request, HttpServletRequest data) {
		 
				
		
		CartEO cart = new CartEO();
		
		List<ProductsEO> productos = new ArrayList<ProductsEO>();
		
	//	productos = productRepo.obtenerProductos(ProductUtil.listaProductCode(request));
		
		float totalP = 0;
		
		String total = "";
		
		for(int c= 0;c<=productos.size();c++) {
			
			totalP =totalP+ (Integer.parseInt(productos.get(c).getPrice())*request.getProductcode().get(c).getQuantity());
		}
		
		total = Float.toString(totalP);
		
		cart = cartRepo.saveAndFlush(CartUtil.llenarEntidad(request, total));
		
		cartProd(productos, cart, request,data);
		
		
			
		
		
		
		
		
		
		
		return null;
	}
	
	
	private void cartProd(List<ProductsEO> productos,CartEO cart,CartRequestBean request,HttpServletRequest data) {
		
		for(int c = 0; c<=productos.size();c++) {
			
			cartProdRepo.save(CartProdUtil.llenarEntidad(cart,productos.get(c).getIdProducts().intValue(), request.getProductcode().get(c).getQuantity()));		
			
		}
		
		updateProduct(request, data,"y");
				
		
	}

	@Override
	public ResponseEntity<ResponseBean> updateProduct(CartRequestBean request, HttpServletRequest data,String cart) {


		List<ProductsEO> productos = new ArrayList<ProductsEO>();
		
		//productos = productRepo.obtenerProductos(ProductUtil.listaProductCode(request));
		
		
		
		if(cart.equals("y")) {
		for(int c = 0; c<=productos.size();c++) {
			
			ProductRecordEO newRecordProduct = new ProductRecordEO();
			
			ProductsEO nuevaEntidad = new ProductsEO();
			
			
		/*	Optional<ProductsEO> oldEntity = productRepo.getEntity(productos.get(c).getProductCode());
			if(oldEntity.isPresent()) {
				nuevaEntidad = oldEntity.get();
				
				int cantidadActual = 0;
				
				int cantidadRecibida =0;
				
				int resultado  = 0;
				
				cantidadActual = nuevaEntidad.getStock();
				cantidadRecibida = request.getProductcode().get(c).getQuantity();
				
				resultado = cantidadActual-cantidadRecibida;
				
				nuevaEntidad.setStock(resultado);
				
				//newRecordProduct = ProductUtil.newProductRecord(nuevaEntidad)
			
			
			}
		}
			}else {
				
				
			}
			*/
		}
			
			
		

		
		
	}
		return null;
	
	
	
	
	

}}
