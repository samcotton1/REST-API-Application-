package esg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Configuration
class LoadData {
  private static final Logger log = LoggerFactory.getLogger(LoadData.class);
  //Will run bean when all context is loaded
  @Bean
  CommandLineRunner initDatabase(PersonRepository repository) {
    return args -> {
    	 try {
    		 //Takes data stored in text file, goes through each line, then splits up the data where there is a space and stores in array
             File f = new File("D:/Users/Samuel Cotton/Desktop/testdata.txt");
             Scanner sc = new Scanner(f);
             while(sc.hasNextLine()){
                 String line = sc.nextLine();
                 String[] details = line.split(" ");
                 //Loads the data into the log and saves it to the repository 
                 log.info("Preloading " + repository.save(new Person(details[0], details[1], details[2], details[3], details[4], details[5], details[6])));
             }
             //Catch statement if no file is found
         } catch (FileNotFoundException e) {         
             e.printStackTrace();
         }
    };
  }
}