public class GradeCheck {
    public static void main(String[] args) {
        int percent = 78;

        if (percent >= 85 && percent <= 100) {
            System.out.println("Grade A");
        } else if (percent >= 70) {
            System.out.println("Grade B");
        } else if (percent >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }

        switch (percent / 10) {
            case 10:
            case 9:
            case 8:
                System.out.println("Grade A");
                break;
            case 7:
                System.out.println("Grade B");
                break;
            case 6:
            case 5:
                System.out.println("Grade C");
                break;
            default:
                System.out.println("Fail");
        }
    }
}