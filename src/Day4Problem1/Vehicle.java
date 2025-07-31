package Day4Problem1;

public class Vehicle {
	double mileage;
    double price;
}

class Car extends Vehicle {
    double ownershipCost;
    int warranty;
    int seatingCapacity;
    String fuelType;
}

class Bike extends Vehicle {
    int cylinders;
    int gears;
    String coolingType;
    String wheelType;
    int fuelTankSize;
}

class Audi extends Car {
    String modelType;
    void display() {
        System.out.println("Audi Model: " + modelType);
        System.out.println("Ownership Cost: " + ownershipCost);
        System.out.println("Warranty: " + warranty + " years");
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Mileage: " + mileage);
        System.out.println("Price: " + price);
    }
}

class Ford extends Car {
    String modelType;
    void display() {
        System.out.println("Ford Model: " + modelType);
        System.out.println("Ownership Cost: " + ownershipCost);
        System.out.println("Warranty: " + warranty + " years");
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Mileage: " + mileage);
        System.out.println("Price: " + price);
    }
}

class Bajaj extends Bike {
    String makeType;
    void display() {
        System.out.println("Bajaj Make: " + makeType);
        System.out.println("Cylinders: " + cylinders);
        System.out.println("Gears: " + gears);
        System.out.println("Cooling: " + coolingType);
        System.out.println("Wheel: " + wheelType);
        System.out.println("Fuel Tank: " + fuelTankSize);
        System.out.println("Mileage: " + mileage);
        System.out.println("Price: " + price);
    }
}

class TVS extends Bike {
    String makeType;
    void display() {
        System.out.println("TVS Make: " + makeType);
        System.out.println("Cylinders: " + cylinders);
        System.out.println("Gears: " + gears);
        System.out.println("Cooling: " + coolingType);
        System.out.println("Wheel: " + wheelType);
        System.out.println("Fuel Tank: " + fuelTankSize);
        System.out.println("Mileage: " + mileage);
        System.out.println("Price: " + price);
    }


}
