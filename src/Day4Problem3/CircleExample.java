package Day4Problem3;

public class CircleExample {
	 static class Point {
	        private int x;
	        private int y;

	       
	        public Point() {
	            x = 0;
	            y = 0;
	        }

	       
	        public void setPoint(int x, int y) {
	            this.x = x;
	            this.y = y;
	        }

	        public int getX() {
	            return x;
	        }

	       
	        public int getY() {
	            return y;
	        }

	        
	        public void printPoint() {
	            System.out.println("(" + x + "," + y + ")");
	        }
	    }

	    
	    static class Circle extends Point {
	        private double radius;

	        
	        public Circle() {
	            super();
	            radius = 1; 
	        }

	     
	        public void setRadius(double radius) {
	            if (radius > 0)
	                this.radius = radius;
	            else
	                this.radius = 1; 
	        }

	  
	        public double getRadius() {
	            return radius;
	        }

	        
	        public double area() {
	            return Math.PI * radius * radius;
	        }
	    }
}