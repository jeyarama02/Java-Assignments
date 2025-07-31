package Day4Problem4;
	class A {
	    public void displayA() {
	        System.out.println("Class A method");
	    }
	}
	class B {
	    public void displayB() {
	        System.out.println("Class B method");
	    }
	}
	interface X {
	    void showX();
	}

	interface Y {
	    void showY();
	}
	class C implements X, Y {
	    public void showX() {
	        System.out.println("Interface X method implemented in C");
	    }
	    public void showY() {
	        System.out.println("Interface Y method implemented in C");
	    }
}

