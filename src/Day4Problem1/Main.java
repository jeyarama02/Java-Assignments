/*1. We want to store the information about different vehicles. Create a class named Vehicle with two data member named mileage and price. Create its two subclasses
---Car with data members to store ownership cost, warranty (by years), seating capacity and fuel type (diesel or petrol).
---Bike with data members to store the number of cylinders, number of gears, cooling type(air, liquid or oil), wheel type(alloys or spokes) and fuel tank size(in inches)
Make another two subclasses Audi and Ford of Car, each having a data member to store the model type.
Next, make two subclasses Bajaj and TVS, each having a data member to store the make-type.
Now, store and print the information of an Audi and a Ford car (i.e. model type, ownership cost, warranty, seating capacity, fuel type, mileage and price.) Do the same for a Bajaj and a TVS bike*/

package Day4Problem1;

public class Main {

	public static void main(String[] args) {
		 Audi a = new Audi();
	        a.modelType = "A6";
	        a.ownershipCost = 25000;
	        a.warranty = 5;
	        a.seatingCapacity = 5;
	        a.fuelType = "Diesel";
	        a.mileage = 18;
	        a.price = 5500000;
	        a.display();

	        System.out.println("---------------");

	        Ford f = new Ford();
	        f.modelType = "Mustang";
	        f.ownershipCost = 30000;
	        f.warranty = 3;
	        f.seatingCapacity = 4;
	        f.fuelType = "Petrol";
	        f.mileage = 12;
	        f.price = 7500000;
	        f.display();

	        System.out.println("---------------");

	        Bajaj b = new Bajaj();
	        b.makeType = "Pulsar";
	        b.cylinders = 1;
	        b.gears = 5;
	        b.coolingType = "Air";
	        b.wheelType = "Alloys";
	        b.fuelTankSize = 15;
	        b.mileage = 50;
	        b.price = 90000;
	        b.display();

	        System.out.println("---------------");

	        TVS t = new TVS();
	        t.makeType = "Apache";
	        t.cylinders = 1;
	        t.gears = 5;
	        t.coolingType = "Oil";
	        t.wheelType = "Spokes";
	        t.fuelTankSize = 14;
	        t.mileage = 45;
	        t.price = 85000;
	        t.display();


	}

}
