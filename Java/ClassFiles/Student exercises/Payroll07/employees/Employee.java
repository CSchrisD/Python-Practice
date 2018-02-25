/* Instructions:
    Create a package called employees; put the Employee.java file into this package (leave Payroll where it is).
    This will require not only creating the directory and moving the file, but also adding an import statement to 
    Payroll and a package statement to Employee.
    Also, if Employee.class still exists in the original directory, it's presence may cause compilation problems - 
    delete Employee.class (the IDE's call this doing a clean) .
    To compile, start in the project root directory (the directory containing Payroll). 
    If you compile Payroll as usual, it will also find and compile Employee. 
    To compile just Employee, you would still work in the project root directory, but execute.
    	
    javac employees\Employee.java
    Run Payroll in the usual fashion.
*/

package employees;

public class Employee {
    // fields
    private static int nextID = 1;
    private int employeeID = nextID++;
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

    public static int getNextId() {
        return nextID;
    }
    public static void setNextId(int nextId) {
        Employee.nextID = nextId;
    }
}