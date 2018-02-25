/* Instructions:

    Now we can clean up our Employee class definition.
    Modify the set methods to use the same name for each parameter as the associated field.
    Modify the constructors to eliminate redundant code - for example:
        
    public Employee(String firstName, String lastName, int dept) {
        this(firstName, lastName); setDept(dept);
    }

    If you haven't already done so, make use of getFullName in getPayInfo.
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

    public Employee(String firstName, String lastName) {
       setFirstName(firstName);
       setLastName(lastName);
    }
  
    public Employee(String firstName,String lastName, int dept) {
       this(firstName, lastName);
       setDept(dept);
    }

    public Employee(String firstName, String lastName, double payRate) {
       this(firstName, lastName);
       setPay(payRate);
    }

    public Employee(String firstName, String lastName, 
            int dept, double payRate) {
       this(firstName, lastName, dept);
       setPay(payRate);
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
        return (getFullName() + " " + employeeID + " " + dept + " " + payRate);
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