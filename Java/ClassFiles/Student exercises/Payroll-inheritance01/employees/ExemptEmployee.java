package employees;

public class ExemptEmployee extends Employee {
    /** 
        Constructs an empty ExemptEmployee
    */
    public ExemptEmployee() {}

    /**
        Constructs an ExemptEmployee with first and last names
        @param  firstName the first name
        @param lastName the last name
    */
    public ExemptEmployee(String firstName, String lastName) {
       super(firstName, lastName);
    }
  
    /**
        Constructs an ExemptEmployee with first and last names, and department number
        @param  firstName the first name
        @param lastName the last name
        @param dept the department number
    */
    public ExemptEmployee(String firstName,String lastName, int dept) {
       super(firstName, lastName, dept);
    }

    /**
        Constructs an ExemptEmployee with first and last names, department number,
        and pay rate
        @param  firstName the first name
        @param lastName the last name
        @param payRate the pay rate
    */
    public ExemptEmployee(String firstName, String lastName, double payRate) {
       super(firstName, lastName, payRate);
    }

    /**
        Constructs an ExemptEmployee with first and lsst names, department number,
        and pay rate
        @param firstName the first name
        @param lastName the last name
        @param dept the department number
        @param payRate the pay rate
    */
    public ExemptEmployee(String firstName, String lastName, 
            int dept, double payRate) {
       super(firstName, lastName, dept, payRate);
    }

    /**
        Retrieves a pay information string
        @return a String with the pay information
    */
    public String getPayInfo() {
        return (getFullName() + " " + getID() + " " + getDept() + " " + getPayRate());
    }
}