package jan19;

public class Manager extends Employee {

    public Manager(int employeeId, String name, double salary) {
        super(employeeId, name, salary);
    }

    public void displayDetails() {

        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);

    }


}
