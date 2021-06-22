package esg;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 
 * @author Sam Cotton
 * Person Class
 * Getters and Setters to process the information from the text file, to be stored correctly
 * 
 */

@Entity
class Person {
//Different fields asked for, the ref number auto generated
  private @Id @GeneratedValue Long id;
  private String name;
  private String addressline1;
  private String addressline2;
  private String town;
  private String county;
  private String country;
  private String postcode;
  
  public Person(){}
  
  Person(String name, String addressline1, String addressline2, String town, String county, String country, String postcode) {
//When a new Person is created, all data is passed and stored as this persons info
    this.name = name;
    this.addressline1 = addressline1;
    this.addressline2 = addressline2;
    this.town = town;
    this.county = county;
    this.country = country;
    this.postcode = postcode;
  }
//Getters for all infomation
  public Long getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public String getaddressline1() {
    return this.addressline1;
  }
  
  public String getAddressline2() {
		return this.addressline2;
	}
  
  public String getTown() {
		return this.town;
	}
  
  public String getCounty() {
	  return this.county;
  }
  
  public String getCountry() {
		return this.country;
	}
  
  public String getPostcode() {
		return this.postcode;
	}

  //Setters for all infomation
  public void setId(Long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setaddressline1(String addressline1) {
    this.addressline1 = addressline1;
  }
  
  public void setAddressline2(String addressline2) {
	this.addressline2 = addressline2;
  }

  public void setTown(String town) {
	this.town = town;
  }

  public void setCounty(String county) {
	this.county = county;
  }

  public void setCountry(String country) {
	this.country = country;
  }

  public void setPostcode(String postcode) {
	this.postcode = postcode;
  }
  //Override to compare 2 complex objects
  @Override
  public boolean equals(Object o) {

    if (this == o)
      return true;
    if (!(o instanceof Person))
      return false;
    Person person = (Person) o;
    return Objects.equals(this.id, person.id) 
    	&& Objects.equals(this.name, person.name)
        && Objects.equals(this.addressline1, person.addressline1)
        && Objects.equals(this.addressline2, person.addressline2)
        && Objects.equals(this.town, person.town)
        && Objects.equals(this.town, person.county)
        && Objects.equals(this.town, person.country)
        && Objects.equals(this.town, person.postcode);
  }
//Override to prevent the class from not functioning properly
  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.name, this.addressline1, this.addressline2, this.town, this.county, this.country, this.postcode);
  }
//Puts all infomation into 1 string spaced out 
  @Override
  public String toString() {
    return "Person{" + "id=" + this.id +
    		", name='" + this.name + '\'' +
    		'\'' +", address line 1='" + this.addressline1 +
    		'\'' +", address line 2='" + this.addressline2 +
    		'\'' +", town ='" + this.town +
    		'\'' +", county='" + this.county +
    		'\'' +", country='" + this.country + 
    		'\'' +", postcode='" + this.postcode + '\'' +'}' + "\n";
  }
}