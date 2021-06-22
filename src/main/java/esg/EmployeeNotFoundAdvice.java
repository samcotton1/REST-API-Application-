package esg;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
/**
 * 
 * @author Samuel Cotton
 * PersonNotFoundAdvice Class
 * Class sorts out the EmployeeNotFound Exception, and will organise it when called 
 */
@ControllerAdvice
class PersonNotFoundAdvice {
  @ResponseBody
  @ExceptionHandler(PersonNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  String personNotFoundHandler(PersonNotFoundException ex) {
    return ex.getMessage();
  }
}