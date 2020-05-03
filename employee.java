/**
 * Mario Pascua Fernandez
 * Computer Sciense II Section 01
 * Assigment 2
 * Due on 03/14/2020
 */

/* Write a class to represent an Employee. For the purposes of this assignment, Employees have only a name, an employee id number, a home address, and a pay rate.
The employee id number is automatically generated , this means you will need a second variable to help with counting).
The home address must be of type Address that you created above.
Include the following methods:
•	a constructor with parameters for name, address, and pay rate, remember the address needs to be a deep copy
•	getters and setters for all attributes except the employee number. Remember that the home address needs to be a deep copy
•	Employees are equal if they have the same id number and name, include an equals method to reflect this
•	a toString method that prints useful information about the Employee in a logical fashion
•	a method named work that simply prints "workin' for the man"
*/

public class employee {

   private int id;
   private String name;
   private String address;
   private double payrate;
   private static int nextID = 1;

   // nextID is the second variable being used to help count employee id number.

   employee(address address, double payrate, String name) {
       this.address = address;
       this.payrate = payrate;
       this.name = name;

       id = nextID++;
   }
  
  
  
   /**
   * @return the name
   */
   public String getName() {
       return name;
   }

   /**
   * @param name 
   */
   public void setName(String name) {
       this.name = name;
   }

   /**
   * @return the address
   */
   public address getAddress() {
       return address;
   }

   /**
   * @param address the address to set
   */
   public void setAddress(address address) {
       this.address = address;
   }

   /**
   * @return the payrate
   */
   public double getPayrate() {
       return payrate;
   }

   /**
   * @param payrate the payrate to set
   */
   public void setPayrate(double payrate) {
       this.payrate = payrate;
   }

   // Overriding clone() method to create a deep copy of an object.
   @Override
   protected Object clone() throws CloneNotSupportedException {
       employee e = (employee) super.clone();
       e.address = (address) super.clone();
       return e;
   }

   /*
   * @see java.lang.Object#hashCode()
   */
   @Override
   public int hashCode() {
       final int prime = 31;
       int result = 1;
       result = prime * result + id;
       result = prime * result + ((name == null) ? 0 : name.hashCode());
       return result;
   }

   /*
   equals method
   */
   public boolean equals(Object obj) {
       if (this == obj)
           return true;
       if (obj == null)
           return false;
       if (getClass() != obj.getClass())
           return false;
       employee other = (employee) obj;
       if (id != other.id)
           return false;
       if (name == null) {
           if (other.name != null)
               return false;
       } else if (!name.equals(other.name))
           return false;
       return true;
   }

   /* 
   * @toString()
   */
   @Override
   public String toString() {
       return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", payrate=" + payrate + "]";
   }

   public String work() {
       return "Working for the man";
   }
  
  
  
}