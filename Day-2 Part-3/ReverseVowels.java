public class ReverseVowels {
    public static void main(String[] args) {
        String s = "leetcode";
        char[] chars = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            while (i < j && !isVowel(chars[i])) i++;
            while (i < j && !isVowel(chars[j])) j--;
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        System.out.println(new String(chars));
    }

    static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
