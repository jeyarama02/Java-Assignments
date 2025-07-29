public class EmployeeInfo {
    String name;
    int year;
    String address;

    EmployeeInfo(String name, int year, String address) {
        this.name = name;
        this.year = year;
        this.address = address;
    }

    void display() {
        System.out.format("%-10s %-15d %s\n", name, year, address);
    }

    public static void main(String[] args) {
        EmployeeInfo e1 = new EmployeeInfo("kathir", 1994, "9/12- sivagiri");
        EmployeeInfo e2 = new EmployeeInfo("ramar", 2000, "9/34- sankaran kovil");
        EmployeeInfo e3 = new EmployeeInfo("siva", 1999, "9/146- kambam");

        System.out.format("%-10s %-15s %s\n", "Name", "Year of Joining", "Address");
        e1.display();
        e2.display();
        e3.display();
    }
}
