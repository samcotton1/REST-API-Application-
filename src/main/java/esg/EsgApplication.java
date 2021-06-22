package esg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;
//Application which starts the whole application
@SpringBootApplication
public class EsgApplication {
  public static void main(String... args) {
	  //Runs spring to allow everything to get to work
	 SpringApplication.run(EsgApplication.class, args);
  }
}