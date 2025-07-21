public class SelectionSortDescending {
    public static void main(String[] args) {
        int[] weights = {55, 78, 45, 90, 62, 49, 81, 33, 67, 72};

        for (int i = 0; i < weights.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < weights.length; j++) {
                if (weights[j] > weights[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = weights[i];
            weights[i] = weights[maxIndex];
            weights[maxIndex] = temp;
        }

        for (int w : weights) {
            System.out.print(w + " ");
        }
    }
}
