package jan20.CollectionDemos;
import java.util.HashMap;
import java.util.Map;

public class Taskque3 {
    static HashMap<Integer, String> employees = new HashMap<>();
    static void addEmployee(int id, String name) {
        employees.put(id, name);
        System.out.println("Employee added: " + id + " -> " + name);
    }
    static void searchEmployee(int id) {
        if (employees.containsKey(id)) {
            System.out.println("Employee Found: " + id + " -> " + employees.get(id));
        } else {
            System.out.println("Employee ID " + id + " not found");
        }
    }

    // Updating the employee id
    static void updateEmployee(int id, String newName) {
        if (employees.containsKey(id)) {
            employees.put(id, newName);
            System.out.println("Employee updated: " + id + " -> " + newName);
        } else {
            System.out.println("Employee ID " + id + " not found");
        }
    }

    // Delete employee
    static void deleteEmployee(int id) {
        if (employees.containsKey(id)) {
            employees.remove(id);
            System.out.println("Employee deleted with ID: " + id);
        } else {
            System.out.println("Employee ID " + id + " not found");
        }
    }

    static void displayEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees available");
            return;
        }

        System.out.println("\n--- Employee Directory ---");
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " | Name: " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        // Add employees
        addEmployee(101, "Amit");
        addEmployee(102, "Neha");
        addEmployee(103, "Ravi");


        displayEmployees();
        searchEmployee(102);


        updateEmployee(103, "Ravindra");

        deleteEmployee(101);

        displayEmployees();
    }
}
