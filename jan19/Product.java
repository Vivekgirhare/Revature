package jan19;


public final class Product {

    int productId;
    String productName;

    private double price;

    public static final double GST_RATE = 18;

    // we have create constructor here
    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    // getter
    public double getPrice() {
        return price;
    }

    // this is a static method to calculate GST
    public static double calculateGST(double price) {
        return price * GST_RATE / 100;
    }

}