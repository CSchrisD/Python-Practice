/* Instructions:
    Add more Employee constructors:
        One that takes values for first and last names only.
        One that takes values for first name, last name, and department.
        One that takes values for first name, last name, and pay rate.
        Note that, in practice, you can use the parameter lists for constructors to help enforce what you would consider valid combinations of properties - for example, if you would not want an employee to exist in a state where they had name and department information, but no pay rate, then the absence of that particular constructor would help ensure that
        judicious use of copy-paste-edit can speed up this process, but be careful to make every necessary edit if you do this!
    You will find yourself writing somewhat repetitive code, setting the same values the same way in several different constructors - we will address this in a few pages.
    In Payroll, create and pay additional instances using these constructors.
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

    public Employee(String first, String last) {
        firstName = first;
        lastName = last;
    }

    public Employee(String first, String last, int d) {
        firstName = first;
        lastName = last;
        dept = d;
    }

    public Employee(String first, String last, double pay) {
        firstName = first;
        lastName = last;
        payRate = pay;
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