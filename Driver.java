/**
 * Mario Pascua Fernandez
 * Computer Sciense II Section 01
 * Assigment 2
 * Due on 03/14/2020
 */

/*Write a driver class that gets input from the user for the attributes of at least 3 Employees.
Create 3 instances and add them to an ArrayList (Note: you can do this directly by adding them as 
anonymous objects -- see the Car class update from 03/02). Using this ArrayList of objects, print each Employee
*/

import java.util.*;

public class driver {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("How many employees: ");
        //int n = in.nextInt();
        String address;
        String name;
        double payrate;

        ArrayList<employee> employees = new ArrayList<employee>();
        for (int i = 1; i < 3; i++) {

            System.out.printf( "Employee%d\n",i);

            System.out.print("Enter address of employee: ");
            address = key.nextLine();

            System.out.print("Enter name of employee: ");
            name = key.nextLine();

            System.out.print("Enter pay rate: ");
            payrate = key.nextDouble();
           
            employees.add(new employee(name, address, payrate));
           
        }
            System.out.println(employees);
    
    }
}
