public class SingleDoubleDigitSum {
    
    static void print(int x[], int n) {
        int singleDigitSum = 0;
        int doubleDigitSum = 0;

        for (int i = 0; i < n; i++) {
            if (x[i] >= 0 && x[i] <= 9) {
                singleDigitSum += x[i];
            } else if (x[i] >= 10 && x[i] <= 99) {
                doubleDigitSum += x[i];
            }
        }

        System.out.println("Sum of single-digit numbers: " + singleDigitSum);
        System.out.println("Sum of double-digit numbers: " + doubleDigitSum);
    }

    public static void main(String[] args) {
        int[] arr = {5, 12, 88, 3, 7, 100, 0, 23, 99, 11};
        int len = arr.length;
        print(arr, len);
    }
}
