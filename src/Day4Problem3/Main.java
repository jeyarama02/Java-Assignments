package Day4Problem3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        
	        Circle c = new Circle();

	        
	        System.out.print("Enter x: ");
	        int x = sc.nextInt();
	        System.out.print("Enter y: ");
	        int y = sc.nextInt();

	       
	        c.setPoint(x, y);

	       
	        System.out.print("Enter radius: ");
	        double r = sc.nextDouble();
	        c.setRadius(r);

	        
	        System.out.print("Circle center is ");
	        c.printPoint();
	        System.out.println("Radius is " + c.getRadius());
	        System.out.printf("Area is %.2f%n", c.area());

	        sc.close();
	}

}
