public class Payroll {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setFirstName("John");
        e1.setLastName("Doe");
        e1.setDept(23);
        e1.setPay(21.78);
        System.out.println(e1.getPayInfo());

        Employee e2 = new Employee("Jane", "Smith", 3, 33.22);
        System.out.println(e2.getPayInfo());
    }
} 