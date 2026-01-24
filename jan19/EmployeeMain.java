package jan19;

public class EmployeeMain {
    public static void main(String[] args) {

        Manager manager = new Manager(201, "Amit", 90000);

        manager.displayDetails();
        System.out.println("Bonus: " + manager.calculateBonus());
        System.out.println("Company Policy: " + Employee.COMPANY_POLICY);
    }
}
