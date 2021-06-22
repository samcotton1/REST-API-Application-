package esg;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * @author Samuel Cotton
 * PersonREST Class
 * REST API with POST, GET and GETMAPPING
 * 
 */
@RestController
class PersonREST {
//Creates a repository 
  private final PersonRepository repository;
  PersonREST(PersonRepository repository) {
    this.repository = repository;
  }

//Gets all employees when the URL /people is typed with local host
  // Aggregate root
  // tag::get-aggregate-root[]
  @GetMapping("/person")
  List<Person> all() {
    return repository.findAll();
  }
//end::get-aggregate-root[]
  
//POST data - Puts new person into the repository
  @PostMapping("/person")
  Person newPerson(@RequestBody Person newPerson) {
    return repository.save(newPerson);
  }

//GET data - when resquested with a id number, brings back the data, or throws exeception
  @GetMapping("/person/{id}")
  Person one(@PathVariable Long id) {
    return repository.findById(id)
      .orElseThrow(() -> new PersonNotFoundException(id));
  }
}