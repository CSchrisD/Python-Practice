/* Instructions:
    After review with management, it is decided that we will store the following information for each employee:
        Employee ID (an integral number, automatically assigned when a new employee is added). 
        First name and last name.
        Department number (an integral value, call it dept).
        Pay rate (a floating-point value, using a double).
    In addition, we would like:
        A method called getPayInfo() that will return a sentence with the employee's name, id, department, and pay rate amount.
        A method called getFullName() that will return the first and last names separated by a space.
        1. Define a class called Employee with these characteristics, using standard practices for limiting data access and for method naming .
        2. In order to be useful, there should be methods to set and get all properties (except setting the employee id, which will happen automatically in a manner to be determined later; for now, just let it default to 0, but still provide a method to retrieve it).
        3. Create another class called Payroll with a main method, which should: 
            Instantiate an Employee object.
            Set values for all the properties (name, department, and pay rate). 
Call the getPayInfo() method to see the results.
*/

public class Employee {
    // fields
    private int employeeID = 0;
    private String firstName;
    private String lastName;
    private int dept;
    private double payRate;

    // return ID
    public int getID() {
        return employeeID;
    }

    // return employee first name
    public String getFirstName() {
        return firstName;
    }

    // return employee last name
    public String getLastName() {
        return lastName;
    }

    // return department number
    public int getDept() {
        return dept;
    }

    //return pay rate
    public double getPayRate() {
        return payRate;
    }

    // return a sentence with the employee's name, id, department, and pay amount
    public String getPayInfo() {
        return (firstName + " " + lastName + " " + " " + employeeID + " " + dept + " " + payRate);
    }

    // return the first and last names separated by a space
    public String getFullName() {
        return (firstName + " " + lastName);
    }

    // set first name
    public void setFirstName(String fn) {
        firstName = fn;
    }

    // set last name
    public void setLastName(String ln) {
        lastName = ln;
    }

    // set department number
    public void setDept(int x) {
        dept = x;
    }

    // set pay rate
    public void setPay(double p) {
        payRate = p;
    }
}