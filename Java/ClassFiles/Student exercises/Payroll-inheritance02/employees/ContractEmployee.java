package employees;

public class ContractEmployee extends Employee {
   /**
   	  Stores the amount of hours worked
   */
   private double hours;

    /** 
        Constructs an empty ContractEmployee
    */
    public ContractEmployee() {}

    /**
        Constructs an ContractEmployee with first and last names
        @param  firstName the first name
        @param lastName the last name
    */
    public ContractEmployee(String firstName, String lastName) {
       super(firstName, lastName);
    }
  
    /**
        Constructs an ContractEmployee with first and last names, and department number
        @param  firstName the first name
        @param lastName the last name
        @param dept the department number
    */
    public ContractEmployee(String firstName,String lastName, int dept, double hours) {
       super(firstName, lastName, dept);
       setHours(hours);
    }

    /**
        Constructs an ContractEmployee with first and last names, department number,
        and pay rate
        @param  firstName the first name
        @param lastName the last name
        @param payRate the pay rate
    */
    public ContractEmployee(String firstName, String lastName, double payRate, double hours) {
       super(firstName, lastName, payRate);
       setHours(hours);
    }

    /**
        Constructs an ContractEmployee with first and lsst names, department number,
        and pay rate
        @param firstName the first name
        @param lastName the last name
        @param dept the department number
        @param payRate the pay rate
    */
    public ContractEmployee(String firstName, String lastName, 
            int dept, double payRate, double hours) {
       super(firstName, lastName, dept);
       setPay(payRate);
    }

    /**
    	Set the amount of hours worked
    */
    public void setHours(double hours){
    	this.hours = hours;
    }

    /**
    	Retrieves the amount of hours worked
    */
    public double getHours(){
    	return hours;
    }
    /**
        Retrieves a pay information string
        @return a String with the pay information
    */
    public String getPayInfo() {
        return (getFullName() + " " + getID() + " " + getDept() + " " + getPayRate() * hours);
    }
}