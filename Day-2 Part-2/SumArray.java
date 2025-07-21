public class SumArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 10, 13, 16, 19, 22, 25, 28};
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            if (arr[i] % 2 != 0) {
                sum += arr[i];
            }
        }

        System.out.println("Sum of odd numbers: " + sum);
    }
}