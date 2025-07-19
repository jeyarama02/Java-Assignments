public class PatternWhile {
    public static void main(String[] args) {
        int num = 1, i = 1;
        while (i <= 5) {
            int j = 1;
            while (j <= i) {
                System.out.print(num + " ");
                num++;
                j++;
            }
            int w = 1;
            while (w <= i) {
                System.out.print("w ");
                w++;
            }
            System.out.println();
            i++;
        }
    }
}