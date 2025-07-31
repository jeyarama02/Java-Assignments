package Day4Problem6;

public class Main {

	public static void main(String[] args) {
		Store.setStoreDetails("kappal SuperMart", "Tenkasi");

       
        Store store = new Store();

       
        Product p1 = new Product(101, "Laptop", 55000.0, 5);
        Product p2 = new Product(102, "Mobile", 15000.0, 10);
        Product p3 = new Product(103, "Headphones", 2000.0, 20);
        store.addProduct(p1);
        store.addProduct(p2);
        store.addProduct(p3);
        Store.displayStoreDetails();
        store.displayAllProducts();
    }
}


class Product {
    private int productId;
    private String name;
    private double price;
    private int quantity;

    
    public Product(int productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    
    public void displayProduct() {
        System.out.println("ID: " + productId + ", Name: " + name + ", Price: " + price + ", Quantity: " + quantity);
    }

	}

