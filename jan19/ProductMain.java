package jan19;

public class ProductMain {

    public static void main(String[] args) {

        Product p = new Product(1, "Mobile", 50000);

        double gst = Product.calculateGST(p.getPrice());

        System.out.println("Product Name: " + p.productName);
        System.out.println("Price: " + p.getPrice());
        System.out.println("GST Amount: " + gst);
    }
}