/**
 * @author dro97
 *
 * 
 */
package barlu.back.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import barlu.back.test.model.CartProductEO;

/**
 * @author dro97
 *
 */
public interface ICartProdRepository extends JpaRepository<CartProductEO, Long> {

}
