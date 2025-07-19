public class MinimumThree {
    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        int c = 5;
        int min = a;

        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }

        System.out.println("The minimum number is: " + min);
    }
}