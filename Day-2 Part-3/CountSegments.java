public class CountSegments {
    public static void main(String[] args) {
        String s = "Hello, my name is John";
        String[] parts = s.trim().split("\\s+");
        int count = s.trim().isEmpty() ? 0 : parts.length;
        System.out.println(count);
    }
}
