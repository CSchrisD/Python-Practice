import employees.*;
import util.*;

/**
* Tests the {@link Employee} class.
*/

public class Payroll {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setFirstName("John");
        e1.setLastName("Doe");
        e1.setDept(23);
        e1.setPay(21.78);
        
        Employee e2 = new Employee("Jane", "Smith", 3, 33.22);
        Employee e3 = new Employee("Joe", "Dirt", 55);
        Employee e4 = new Employee("Mary", "Sue", 13.43);
        

        String fn = KeyboardReader.getPromptedString("Please enter first name: ");
        String ln = KeyboardReader.getPromptedString("Please enter last name: ");
        double pay = KeyboardReader.getPromptedDouble("Please enter pay rate: ");
        if(pay < 0){
            System.out.println("Pay rate must be greater than or equal to 0.0");
            pay = 0.0;
        }
        int dept = KeyboardReader.getPromptedInt("Please enter department number: ");
        if(dept <= 0) {
            System.out.println("Department must be greater than 0");
            dept = 1;
        }
        Employee e5 = new Employee(fn, ln, dept, pay);

        System.out.println(e1.getPayInfo());
        System.out.println(e2.getPayInfo());
        System.out.println(e3.getPayInfo());
        System.out.println(e4.getPayInfo());

        
        System.out.println(e5.getPayInfo());
    }
} 