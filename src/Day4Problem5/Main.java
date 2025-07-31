/*Create a class named Shape with a method that prints "This is a shape". Create another class named Polygon inheriting the Shape class with the same method that prints "Polygon is a shape". Create two other classes named Rectangle and Triangle having the same method which prints "Rectangle is a polygon" and "Triangle is a polygon" respectively. Again, make another class named Square having the same method which prints "Square is a rectangle".*/
package Day4Problem5;



public class Main {

	public static void main(String[] args) {
		   Shape s = new Shape();
	        Polygon p = new Polygon();
	        Rectangle r = new Rectangle();
	        Triangle t = new Triangle();
	        Square sq = new Square();

	        s.display();
	        p.display();
	        r.display();
	        t.display();
	        sq.display();

	}

}
