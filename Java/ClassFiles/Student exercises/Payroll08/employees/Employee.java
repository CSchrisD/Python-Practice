/* Instructions:
    Add javadoc comments to all the fields and methods in Employee. Don't worry about making 
    them completely descriptive, but do document parameters and return values for the methods. 
    Note that judicious use of copy and paste can speed up the process.

    Run javadoc and view index.html in a browser.
*/

package employees;

public class Employee {
    /** 
      <code>nextID</code> holds the id of the next employee instance  
    */
    private static int nextID = 1;

    /** 
        Stores the current next id value in this insance and increments <code>nextID</code>
    */
    private int employeeID = nextID++;

    /** 
        Stores the first name
    */
    private String firstName;

    /** 
        Stroes the last name
    */
    private String lastName;

    /** 
        Stores the department number
    */
    private int dept;

    /** 
      Stores the pay rate  
    */
    private double payRate;

    /** 
        Constructs an empty employee
    */
    public Employee() {}

    /**
        Constructs an Employee with first and last names
        @param  firstName the first name
        @param lastName the last name
    */
    public Employee(String firstName, String lastName) {
       setFirstName(firstName);
       setLastName(lastName);
    }
  
    /**
        Constructs an Employee with first and last names, and department number
        @param  firstName the first name
        @param lastName the last name
        @param dept the department number
    */
    public Employee(String firstName,String lastName, int dept) {
       this(firstName, lastName);
       setDept(dept);
    }

    /**
        Constructs an Employee with first and last names, department number,
        and pay rate
        @param  firstName the first name
        @param lastName the last name
        @param payRate the pay rate
    */
    public Employee(String firstName, String lastName, double payRate) {
       this(firstName, lastName);
       setPay(payRate);
    }

    /**
        Constructs an Employee with first and lsst names, department number,
        and pay rate
        @param firstName the first name
        @param lastName the last name
        @param dept the department number
        @param payRate the pay rate
    */
    public Employee(String firstName, String lastName, 
            int dept, double payRate) {
       this(firstName, lastName, dept);
       setPay(payRate);
    }
    
    /**
        Retrieves the id
        @return the id
    */
    public int getID() {
        return employeeID;
    }

    /**
        Retrieves the first name
        @return the first name
    */
    public String getFirstName() {
        return firstName;
    }

    /**
        Retrieves the last name
        @return the last name
    */
    public String getLastName() {
        return lastName;
    }

    /**
        Retrieves the department
        @return the department
    */
    public int getDept() {
        return dept;
    }

    /**
        Retrieves the pay rate
        @return the pay rate
    */
    public double getPayRate() {
        return payRate;
    }

    /**
        Retrieves a pay information string
        @return a String with the pay information
    */
    public String getPayInfo() {
        return (getFullName() + " " + employeeID + " " + dept + " " + payRate);
    }

    /**
        Retrieves the full name as first name and last name separated by a space
        @return the full name
    */
    public String getFullName() {
        return (firstName + " " + lastName);
    }

    /**
        Sets the first name
        @param firstName the first name
    */
    public void setFirstName(String fn) {
        firstName = fn;
    }

    /**
       Sets the last name
      @param lastName the last name
    */
    public void setLastName(String ln) {
        lastName = ln;
    }

    /**
        Sets the department
        @param dept the department
    */
    public void setDept(int x) {
        dept = x;
    }

    /**
        Sets the pay rate
        @param payRate the pay rate
    */
    public void setPay(double p) {
        payRate = p;
    }

    /**
        Retrieves the next id
        @return the nextId value
    */
    public static int getNextId() {
        return nextID;
    }

    /**
        Retrieves the next id
        @return the nextId value
    */
    public static void setNextId(int nextId) {
        Employee.nextID = nextId;
    }
}