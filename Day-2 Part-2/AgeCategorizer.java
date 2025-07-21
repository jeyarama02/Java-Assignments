public class AgeCategorizer {
    public static void main(String[] args) {
        int[] ages = {12, 25, 17, 35, 61, 45, 8, 70, 19, 59};
        int lessThan18 = 0, between18and60 = 0, greaterThan60 = 0;

        for (int age : ages) {
            if (age < 18) {
                lessThan18++;
            } else if (age <= 60) {
                between18and60++;
            } else {
                greaterThan60++;
            }
        }

        System.out.println("People aged <18: " + lessThan18);
        System.out.println("People aged 18-60: " + between18and60);
        System.out.println("People aged >60: " + greaterThan60);
    }
}
