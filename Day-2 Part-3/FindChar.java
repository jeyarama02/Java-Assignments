public class FindChar {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        int sumS = 0, sumT = 0;
        for (char c : s.toCharArray()) {
            sumS += c;
        }
        for (char c : t.toCharArray()) {
            sumT += c;
        }
        char result = (char)(sumT - sumS);
        System.out.println(result);
    }
}
