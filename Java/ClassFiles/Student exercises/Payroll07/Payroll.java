import employees.*;
import util.*;

/* instructions:
        1. Add another employee to your payroll, this time using the KeyboardReader class to prompt the user for all data; for example, to read a double-precision value for a width: 
          double width = KeyboardReader.getPromptedDouble("Please enter the width: ");
        2. KeyboardReader is in the util package (which should already be present under Exercises); you will need to import the class in Payroll.java.
There are no changes to Employee.java.
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
        int dept = KeyboardReader.getPromptedInt("Please enter department number: ");
        Employee e5 = new Employee(fn, ln, dept, pay);

        System.out.println(e1.getPayInfo());
        System.out.println(e2.getPayInfo());
        System.out.println(e3.getPayInfo());
        System.out.println(e4.getPayInfo());
        System.out.println(e5.getPayInfo());
    }
} 