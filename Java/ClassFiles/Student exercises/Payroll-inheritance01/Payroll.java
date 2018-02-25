import employees.*;
import util.*;

/**
* Tests the {@link Employee} class.
*/

public class Payroll {
    public static void main(String[] args) {
        ExemptEmployee ee = null;
        NonexemptEmployee ne = null;
        ContractEmployee ce = null;

        String fName, lName;
        double hours, payRate;
        int dept;

        fName = KeyboardReader.getPromptedString("Enter first name: ");
        lName = KeyboardReader.getPromptedString("Enter last name: ");
        dept = KeyboardReader.getPromptedInt("Enter department: ");
        do {
            payRate = KeyboardReader.getPromptedDouble("Enter pay rate: ");
            if (payRate < 0.0) System.out.println("Pay rate must be >= 0");
        } while (payRate < 0.0);
        ee = new ExemptEmployee(fName, lName, dept, payRate);
         
        System.out.println(ee.getPayInfo());
 
        fName = KeyboardReader.getPromptedString("Enter first name: ");
        lName = KeyboardReader.getPromptedString("Enter last name: ");
        dept = KeyboardReader.getPromptedInt("Enter department: ");
        do {
            payRate = KeyboardReader.getPromptedDouble("Enter pay rate: ");
            if (payRate < 0.0) System.out.println("Pay rate must be >= 0");
        } while (payRate < 0.0);
        do {
            hours = KeyboardReader.getPromptedDouble("Enter hours: ");
            if (hours < 0.0) System.out.println("Hours must be >= 0");
        } while (hours < 0.0);
        ne = new NonexemptEmployee(fName, lName, dept, payRate, hours);
 
        System.out.println(ne.getPayInfo());
 
        fName = KeyboardReader.getPromptedString("Enter first name: ");
        lName = KeyboardReader.getPromptedString("Enter last name: ");
        dept = KeyboardReader.getPromptedInt("Enter department: ");
        do {
            payRate = KeyboardReader.getPromptedDouble("Enter pay rate: ");
            if (payRate < 0.0) System.out.println("Pay rate must be >= 0");
        } while (payRate < 0.0);
        do {
             hours = KeyboardReader.getPromptedDouble("Enter hours: ");
            if (hours < 0.0) System.out.println("Hours must be >= 0");
        } while (hours < 0.0);
        ce = new ContractEmployee(fName, lName, dept, payRate, hours);
        System.out.println(ce.getPayInfo());
    }
} 