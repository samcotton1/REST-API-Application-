package esg;
/**
 * 
 * @author Samuel Cotton
 * PersonNotFoundException
 *
 *Exception Error only called if an ID was requested and it doesnt exist
 *Prints message bellow
 */
class PersonNotFoundException extends RuntimeException {
  PersonNotFoundException(Long id) {
    super("Could not find employee " + id);
  }
}