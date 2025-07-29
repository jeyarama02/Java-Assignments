import java.util.ArrayList;

class Product {
    int productId;
    String name;
    double price;
    int quantity;

    Product(int productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println();
    }
}

class Store {
    static String storeName;
    static String storeLocation;
    ArrayList<Product> products = new ArrayList<>();

    static void setStoreDetails(String name, String location) {
        storeName = name;
        storeLocation = location;
    }

    static void displayStoreDetails() {
        System.out.println("Store Name: " + storeName);
        System.out.println("Location: " + storeLocation);
        System.out.println();
    }

    void addProduct(Product p) {
        products.add(p);
    }

    void displayAllProducts() {
        for (Product p : products) {
            p.displayProduct();
        }
    }
}

public class InventorySystem {
    public static void main(String[] args) {
        Store.setStoreDetails("SuperMart", "apm");

        Product p1 = new Product(101, "Soap", 25, 100);
        Product p2 = new Product(102, "Shampoo", 120, 50);
        Product p3 = new Product(103, "Toothpaste", 80, 75);

        Store store = new Store();
        store.addProduct(p1);
        store.addProduct(p2);
        store.addProduct(p3);

        Store.displayStoreDetails();
        store.displayAllProducts();
    }
}
