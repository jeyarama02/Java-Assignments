public class Rrrr {
    public static void main(String[] args) {
        int[][] pattern = {
            {2, 4},
            {2, 2},
            {1, 4},
            {2, 2},
            {2, 2}
        };

        for (int i = 0; i < pattern.length; i++) {
            for (int j = 0; j < pattern[i][0]; j++)
                System.out.print("1 ");
            for (int j = 0; j < pattern[i][1]; j++)
                System.out.print("R ");
            System.out.println();
        }
    }
}