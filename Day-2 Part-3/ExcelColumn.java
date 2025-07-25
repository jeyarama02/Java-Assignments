public class ExcelColumn {
    public static void main(String[] args) {
        int columnNumber = 701;
        StringBuilder result = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            char ch = (char) ('A' + (columnNumber % 26));
            result.insert(0, ch);
            columnNumber /= 26;
        }
        System.out.println(result.toString());
    }
}
