/* Instructions:
    Add a private and static integer field called nextId to the Employee class (give it an initial value of 1).
    Modify the declaration of the id field as follows:
        
    private int id = nextId++;
    What happens when each new Employee gets instantiated?
    Run and test the application - you should see incrementing employee ids.
    Now add the following to Employee.java:
        
    public static int getNextId() {
        return nextId;
    }
    public static void setNextId(int nextId) {
        Employee.nextId = nextId;
    }
    Notice the syntax we use to resolve the name conflict between the nextId parameter and the static nextId field.
    In Payroll, before we create the first employee, call Employee.setNextId(22) to set the value that will be used for the first employee.

*/

public class Employee {
    // fields
    private int employeeID = nextID++;
    private String firstName;
    private String lastName;
    private int dept;
    private double payRate;
    private static int nextID = 1;

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

    public static int getNextId() {
        return nextID;
    }
    public static void setNextId(int nextId) {
        Employee.nextID = nextId;
    }
}