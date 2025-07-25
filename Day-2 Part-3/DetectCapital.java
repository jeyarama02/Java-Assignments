public class DetectCapital {
    public static void main(String[] args) {
        String word = "FlaG";
        boolean allUpper = word.equals(word.toUpperCase());
        boolean allLower = word.equals(word.toLowerCase());
        boolean firstCap = Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase());
        boolean result = allUpper || allLower || firstCap;
        System.out.println(result);
    }
}
