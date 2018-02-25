package employees;

public class NonexemptEmployee extends Employee {
   /**
   	  Stores the amount of hours worked
   */
   private double hours;

    /** 
        Constructs an empty NonexemptEmployee
    */
    public NonexemptEmployee() {}

    /**
        Constructs an NonexemptEmployee with first and last names
        @param  firstName the first name
        @param lastName the last name
    */
    public NonexemptEmployee(String firstName, String lastName) {
       super(firstName, lastName);
    }
  
    /**
        Constructs an NonexemptEmployee with first and last names, and department number
        @param  firstName the first name
        @param lastName the last name
        @param dept the department number
    */
    public NonexemptEmployee(String firstName,String lastName, int dept, double hours) {
       super(firstName, lastName, dept);
       setHours(hours);
    }

    /**
        Constructs an NonexemptEmployee with first and last names, department number,
        and pay rate
        @param  firstName the first name
        @param lastName the last name
        @param payRate the pay rate
    */
    public NonexemptEmployee(String firstName, String lastName, double payRate, double hours) {
       super(firstName, lastName, payRate);
       setHours(hours);
    }

    /**
        Constructs an NonexemptEmployee with first and lsst names, department number,
        and pay rate
        @param firstName the first name
        @param lastName the last name
        @param dept the department number
        @param payRate the pay rate
    */
    public NonexemptEmployee(String firstName, String lastName, 
            int dept, double payRate, double hours) {
       super(firstName, lastName, dept, payRate);
       setHours(hours);
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