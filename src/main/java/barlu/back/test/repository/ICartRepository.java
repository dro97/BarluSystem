/**
 * @author dro97
 *
 * 
 */
package barlu.back.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import barlu.back.test.model.CartEO;

/**
 * @author dro97
 *
 */
public interface ICartRepository extends JpaRepository<CartEO, Long>{
	

}
