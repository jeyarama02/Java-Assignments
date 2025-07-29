public class ConstructorStd {
    String name;
    int roll_no;
    long phone_no;
    String address;

    ConstructorStd(String name, int roll_no, long phone_no, String address) {
        this.name = name;
        this.roll_no = roll_no;
        this.phone_no = phone_no;
        this.address = address;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Phone No: " + phone_no);
        System.out.println("Address: " + address);
        System.out.println();
    }

    public static void main(String[] args) {
        ConstructorStd s1 = new ConstructorStd("Sathish", 1, 1234567890L, "9/146 - duvarangadu");
        ConstructorStd s2 = new ConstructorStd("ram", 2, 9876543210L, "26B - apm");

        s1.display();
        s2.display();
    }
}
