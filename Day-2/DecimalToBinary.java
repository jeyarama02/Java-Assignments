public class DecimalToBinary {
    static String convertToBinary(int n) {
        String binary = "";
        while (n > 0) {
            binary = (n % 2) + binary;
            n = n / 2;
        }
        return binary;
    }

    public static void main(String[] args) {
        System.out.println("Binary: " + convertToBinary(10));
    }
}