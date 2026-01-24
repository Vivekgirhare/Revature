package jan14;

public class Product {
    int id;
    String prname;
    double price;

    public void getDetails() {
        System.out.println("Displaying the product info");
        System.out.println("ID: " + id);
        System.out.println("Name: " + prname);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Product probj1 = new Product();

        probj1.id = 111;
        probj1.prname = "Sofa Set";
        probj1.price = 45000.56;

        probj1.getDetails();
    }
}
