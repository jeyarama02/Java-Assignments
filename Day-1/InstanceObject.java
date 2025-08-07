/*10. Write a program to check whether the object is an instance of a particular class?*/
class Father {
}

class Me extends Father {
}

public class InstanceObject {
    public static void main(String[] args) {
        Father f = new Me();

        if (f instanceof Me) {
            System.out.println("f is an instance of Me");
        } else {
            System.out.println("f is NOT an instance of Me");
        }

        if (f instanceof Father) {
            System.out.println("f is also an instance of Father");
        }

        if (f instanceof Object) {
            System.out.println("f is also an instance of Object");
        }
    }

}
