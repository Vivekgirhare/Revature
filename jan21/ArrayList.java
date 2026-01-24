//package jan21;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
//
//class Product{
//    int prodId;
//    String prName;
//    double price;
//
//    public Product() {
//    }
//
//    public Product(int prodId, String prName, double price) {
//        this.prodId = prodId;
//        this.prName = prName;
//        this.price = price;
//    }
//
//    @Override
//    public String toString() {
//        return "Product{" +
//                "prodId=" + prodId +
//                ", prName='" + prName + '\'' +
//                ", price=" + price +
//                '}';
//    }
//}
//
//public class ArrayList {
//    public static void main(String[] args) {
//
//        ArrayList<Product> productlist = new ArrayList<>();
//        productlist.add(new Product(101, "Soap", 76.80));
//        productlist.add(new Product(102, "Toys", 256.80));
//        productlist.add(new Product(103, "Washing powder", 549.90));
//        productlist.add(new Product(105, "Paper", 448.89));
//
//        System.out.println(productlist);
//        HashMap<Integer,Product> productHashMap=new HashMap<>();
//        productHashMap.put(1,new Product(1101,"TVSet",56000.45));
//        productHashMap.put(6,new Product(1102,"Keyboard",14500.90));
//        productHashMap.put(3,new Product(1106,"Speaker",4500.450));
//        productHashMap.put(5,new Product(1104,"Laptop",65000.45));
//        productHashMap.put(2,new Product(1107,"VideoGame",3460.89));
//        System.out.println(productHashMap);
//        for (Map.Entry<Integer,Product> entry:productHashMap.entrySet()) {
//            System.out.println(entry.getKey() + " = " + entry.getValue().prName.toUpperCase());
//        }
//
//    }
//}