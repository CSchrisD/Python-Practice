/*
Instructions:
    Revise your payroll program to use only one Employee variable.
    Use a loop to repeatedly create a new instance to store in it, 
    populate it from the keyboard, and display it on the screen 
    (you can ask after each one if the user wants to enter another, or 
    just use a loop that has a fixed number of iterations).

    Also, change the logic for reading the pay rate and department values 
    from the keyboard to use do . . . while loops that will continue to loop 
    as long as the user enters invalid values (note that you will need to 
    separate declaring the variables from populating them - declare each of them 
    before their loop starts, in order for the variable to be available to the test 
    at the end of the loop).
*/

import employees.*;
import util.*;

/**
* Tests the {@link Employee} class.
*/

public class Payroll {
    public static void main(String[] args) {
        Employee[] e = new Employee[3];
        String fn = null;
        String ln = null;
        int dept = 0;
        double pay = 0.0;

        for(int i = 0; i < e.length; i++){
            fn = KeyboardReader.getPromptedString("Enter first name: ");
            ln = KeyboardReader.getPromptedString("Enter last name: ");

            do { 
                 pay = KeyboardReader.getPromptedDouble("Enter pay rate: ");
                 if(pay < 0.0) System.out.println("Pay rate must be greater than or equal to 0.0");
             } while(pay < 0.0);

            do {
                dept = KeyboardReader.getPromptedInt("Please enter department number: ");
                if(dept <= 0) System.out.println("Department must be greater than 0");
            
            }while(dept <= 0);

            e[i] = new Employee(fn, ln, dept, pay);
            System.out.println(e[i].getPayInfo());
        }

        String lastName = KeyboardReader.getPromptedString("Enter last name to find: ");
        boolean notFound = true;
        for(int j = 0; j < e.length; j++){
            if(lastName.equalsIgnoreCase(e[j].getLastName())){
                System.out.println("Found: " + e[j].getPayInfo());
                notFound = false;
                break;
            }
        }

        if(notFound) System.out.println("Not found");

    }
} 