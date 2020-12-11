/**
 * @author dro97
 *
 * 
 */
package barlu.back.test.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import barlu.back.test.model.ProductsEO;

/**
 * @author dro97
 *
 */
@Repository
public interface IProductRepository extends JpaRepository<ProductsEO, Long>{
	
	
	/*@Query("Select e from ProductsEO e WHERE e.productCode in (:productCode)")
	List<ProductsEO> obtenerProductos(@Param("productCode")List<String> productCode);
	
	
	@Query("Select e from ProductsEO e WHERE e.productcode=:productCode")
	Optional<ProductsEO> getEntity(@Param("productCode")String productCode);*/

	

}
