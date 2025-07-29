public class StudentMarks {
    public static void main(String[] args) {
        int[][] marks = {
            {85, 90, 88},
            {78, 67, 72},
            {92, 89, 85},
            {66, 74, 70},
            {59, 60, 65},
            {77, 81, 79},
            {88, 86, 90},
            {45, 50, 55},
            {99, 98, 100},
            {70, 75, 80}
        };

        System.out.printf( "Roll No", "Total Marks", "Average");
        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            System.out.printf( (i + 1), total, avg);
        }
    }
}
