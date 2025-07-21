public class PrimeArray {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 7, 10, 11, 13, 18, 21, 23, 29};

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            boolean prime = true;


            if (num < 2) {
                prime = false;
            } else {
                for (int j = 2; j < num; j++) {
                    if (num % j == 0) {
                        prime = false;
                        break;
                    }
                }
            }

            if (prime) {
                System.out.print(num + " ");
            }
        }
    }
}