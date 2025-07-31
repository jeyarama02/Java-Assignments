package Day4Problem2;

public class ThreeDExamble {
	
	    
	    static class TwoD {
	        protected double x, y;

	        // Default constructor
	        public TwoD() {
	            System.out.println("TwoD default constructor");
	            x = 0;
	            y = 0;
	        }

	        // Constructor with two arguments
	        public TwoD(double x, double y) {
	            System.out.println("TwoD constructor with two arguments");
	            this.x = x;
	            this.y = y;
	        }

	        // Setters
	        public void setX(double x) { this.x = x; }
	        public void setY(double y) { this.y = y; }

	        // Getters
	        public double getX() { return x; }
	        public double getY() { return y; }
	    }

	    // Derived class ThreeD
	    static class ThreeD extends TwoD {
	        private double z;

	        // Default constructor
	        public ThreeD() {
	            super(); // Calls TwoD default constructor
	            System.out.println("ThreeD default constructor");
	            z = 0;
	        }

	        // Constructor with three arguments
	        public ThreeD(double x, double y, double z) {
	            super(x, y); // Calls TwoD constructor with two arguments
	            this.z = z;
	            System.out.println("ThreeD constructor with three arguments");
	        }

	        // Setter for z
	        public void setZ(double z) { this.z = z; }

	        // Getter for z
	        public double getZ() { return z; }

	        // Method to calculate distance between two ThreeD points
	        public double distance(ThreeD p) {
	            return Math.sqrt(Math.pow(p.x - this.x, 2) +
	                             Math.pow(p.y - this.y, 2) +
	                             Math.pow(p.z - this.z, 2));
	        }

}
	    }