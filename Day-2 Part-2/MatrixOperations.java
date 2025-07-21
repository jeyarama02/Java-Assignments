public class MatrixOperations {

    static void inputMatrix(int[][] A, int m, int n) {
        int val = 1;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                A[i][j] = val++;
    }

    static void displayMatrix(int[][] A, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(A[i][j] + "\t");
            System.out.println();
        }
    }

    static void sumOfElements(int[][] A, int m, int n) {
        int sum = 0;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                sum += A[i][j];
        System.out.println("Sum of all elements: " + sum);
    }

    static void rowWiseSum(int[][] A, int m, int n) {
        for (int i = 0; i < m; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++)
                rowSum += A[i][j];
            System.out.println("Sum of row " + (i + 1) + ": " + rowSum);
        }
    }

    static void colWiseSum(int[][] A, int m, int n) {
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < m; i++)
                colSum += A[i][j];
            System.out.println("Sum of column " + (j + 1) + ": " + colSum);
        }
    }

    static void transpose(int[][] A, int m, int n) {
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++)
                System.out.print(A[i][j] + "\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int m = 3, n = 4;
        int[][] A = new int[m][n];

        inputMatrix(A, m, n);
        System.out.println("Matrix:");
        displayMatrix(A, m, n);

        System.out.println("\nSum of all elements:");
        sumOfElements(A, m, n);

        System.out.println("\nRow-wise sum:");
        rowWiseSum(A, m, n);

        System.out.println("\nColumn-wise sum:");
        colWiseSum(A, m, n);

        System.out.println("\nTranspose of matrix:");
        transpose(A, m, n);
    }
}
