package jan14;

class Menu {
    String[] menuItems;
    double price;
    int quantity;

    // Default constructor
    public Menu() {
        System.out.println("Menu constructor called");
    }

    // Parameterized constructor
    public Menu(String[] menuItems, int quantity, double price) {
        this.menuItems = menuItems;
        this.quantity = quantity;
        this.price = price;
    }

    public void takeOrder() {
        System.out.println("Taking order...");
    }
}

class SnackMenu extends Menu {

    // Constructor of child class
    public SnackMenu(String[] items, int q, double p) {
        super(items, q, p); // calling parent constructor
        System.out.println("Inside SnackMenu constructor");

        System.out.println("Items:");
        for (String item : menuItems) {
            System.out.println(item);
        }

        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
    }
}

public class Inheritance {
    public static void main(String[] args) {

        String[] items = {"Samosa", "Burger", "Sandwich"};
        int quantity = 3;
        double price = 150.0;

        SnackMenu snackMenu = new SnackMenu(items, quantity, price);
        snackMenu.takeOrder();
    }
}
