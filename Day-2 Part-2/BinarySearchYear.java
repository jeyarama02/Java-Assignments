public class BinarySearchYear {
    public static void main(String[] args) {
        int[] years = {1982, 1987, 1993, 1996, 1999, 2002, 2003, 2006, 2007, 2009, 2010, 2016};
        int key = 2003;
        int low = 0, high = years.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (years[mid] == key) {
                found = true;
                break;
            } else if (key < years[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (found) {
            System.out.println("Record exists");
        } else {
            System.out.println("Record does not exist");
        }
    }
}
