public class SetBit {
    public static void main(String args[]) {
        int n = 18; 
        int pos = 1;
        while ((n & 1) == 0) {
            n = n >> 1; 
            pos++;
        }
        System.out.println("The first set bit is at position " + pos);
    }
}