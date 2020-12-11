/**
 * @author dro97
 *
 * 
 */
package barlu.back.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import barlu.back.test.model.ProductRecordEO;

/**
 * @author dro97
 *
 */
@Repository
public interface IProductRecordRepository extends JpaRepository<ProductRecordEO, Long>{

	
	
}
