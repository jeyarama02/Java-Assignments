package Day4Problem5;

public class Shape {
	public void display() {
        System.out.println("This is a shape");
    }
}
    
 class Polygon extends Shape {
        @Override
        public void display() {
            System.out.println("Polygon is a shape");
        }
    }

   
     class Rectangle extends Polygon {
        @Override
        public void display() {
            System.out.println("Rectangle is a polygon");
        }
    }
     class Triangle extends Polygon {
        @Override
        public void display() {
            System.out.println("Triangle is a polygon");
        }
    }

   
     class Square extends Rectangle {
        @Override
        public void display() {
            System.out.println("Square is a rectangle");
        }
}

