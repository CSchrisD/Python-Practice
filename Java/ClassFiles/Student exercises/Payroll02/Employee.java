/* Instructions:

    Modify your Employee class to use a constructor that accepts parameters for the first and last names, department, and pay rate.
    Also add a constructor that takes no parameters and does nothing (as we discussed above).
    public Employee() { }
    In Payroll, modify main to add another Employee variable that receives an instance created using this constructor, then print their pay info.


*/

public class Employee {
    // fields
    private int employeeID = 0;
    private String firstName;
    private String lastName;
    private int dept;
    private double payRate;

    // Constructor
    public Employee() {}

    public Employee(String n1, String n2, int dpt, double pr) {
        firstName = n1;
        lastName = n2;
        dept = dpt;
        payRate = pr;
    }

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