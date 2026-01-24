package jan21;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductArrayList {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        productList.add(new Product(101, "Soap", "Grocery", 45.50));
        productList.add(new Product(102, "Laptop", "Electronics", 65000.75));
        productList.add(new Product(103, "Shampoo", "Grocery", 180.40));
        productList.add(new Product(104, "Mobile", "Electronics", 28000.90));

        // filter products from Electronics category
        List<Product> electronics = productList.stream()
                .filter(p -> p.getCategory().equals("Electronics"))
                .collect(Collectors.toList());

        System.out.println("Electronics category data");
        electronics.forEach(System.out::println);

        // products price more than 1000
        List<String> expensiveProducts = productList.stream()
                .filter(p -> p.getPrice() > 1000)
                .map(Product::getProductName)
                .collect(Collectors.toList());

        // products price less than 1000
        List<String> cheapProducts = productList.stream()
                .filter(p -> p.getPrice() < 1000)
                .map(Product::getProductName)
                .collect(Collectors.toList());

        System.out.println("Products costing more than 1000");
        System.out.println(expensiveProducts);
        System.out.println("Products costing less than 1000");
        System.out.println(cheapProducts);

    }
}