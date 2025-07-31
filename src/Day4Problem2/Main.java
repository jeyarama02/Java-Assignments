package Day4Problem2;

import Day4Problem2.ThreeDExamble.ThreeD;

public class Main {

	public static void main(String[] args) {
		 ThreeD p1 = new ThreeD();
		    p1.setX(1.0);
		    p1.setY(2.0);
		    p1.setZ(3.0);

		    
		    ThreeD p2 = new ThreeD(4.0, 6.0, 8.0);

		  
		    double dist = p1.distance(p2);
		    System.out.println("Distance between two points: " + dist);

	}

}
