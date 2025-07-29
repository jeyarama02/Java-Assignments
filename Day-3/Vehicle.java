class Vehicle {
    int vehicleId;
    String brand;
    double price;
    static int count = 0;

    Vehicle(int vehicleId, String brand, double price) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.price = price;
        count++;
    }

    void display() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }

    static void displayCount() {
        System.out.println("Total vehicles created: " + count);
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(1, "nissan-gtr", 80000);
        Vehicle v2 = new Vehicle(2, "toyoto-fortuner", 60000);

        v1.display();
        v2.display();
        Vehicle.displayCount();
    }
}
