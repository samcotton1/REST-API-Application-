package esg;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * 
 * @author Samuel Cotton
 *Person Repository Class
 *Extends Person to the JPA Repo which allows spring to act
 */

interface PersonRepository extends JpaRepository<Person, Long> {
}