/**
 * Mario Pascua Fernandez
 * Computer Sciense II Section 01
 * Assigment 2
 * Due on 03/14/2020
 */

/**Write a class to represent a person's Address. For the purposes of this assignment, Addresses have only a house number, a street name, and a city. 
Include the following methods:
•	a constructor with parameters to set all of the attributes
•	a copy constructor
•	getters and setters for all attributes
•	a toString method that represents the Address in a format like this: 12345 Main Street, Anywhere.

*/

public class address {

    // atributes

    private int HouseNumber;
    private String StreetName, City;

    // constructor 

    public address (int HouseNumber, String StreetName, String City){
        this.HouseNumber = HouseNumber;
        this.StreetName = StreetName;
        this.City = City;
}

    // Copy contructor
        address (address r1){
        HouseNumber = r1.HouseNumber;
        StreetName = r1.StreetName;
        City = r1.City;
        }

    // Getters 

    /*
    @param getHouseNumber
    @return Housenumber
    */

    public int getHouseNumber() {
        return HouseNumber;
        
    }

    /*
    @param getStreetName
    @return StreetName
    */

    public String getStreetName(){
        return StreetName;
    }

    /*
    @param getCity
    @return City
    */

    public String getCity (){
        return City;
    }

    // Setters

    /*
    @param setHouseNumber
   
    */

    public void setHouseNumber(int HouseNumber) {
        this.HouseNumber = HouseNumber;
    
    }

    /*
    @param setStreetName
   
    */

    public void setStreetName(String StreetName){
        this.StreetName = StreetName;
    }

    /*
    @param setCity
   
    */

    public void setCity (String City){
        this.City = City;
    }
        // To String

        public String toString(){
            return "HouseNumber:" + HouseNumber + "\tStreetName:" + StreetName + "\tCity:" + City;


        }

 }     