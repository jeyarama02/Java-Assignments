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
        EmployeeInfo e1 = new EmployeeInfo("Robert", 1994, "64C- WallsStreat");
        EmployeeInfo e2 = new EmployeeInfo("Sam", 2000, "68D- WallsStreat");
        EmployeeInfo e3 = new EmployeeInfo("John", 1999, "26B- WallsStreat");

        System.out.format("%-10s %-15s %s\n", "Name", "Year of Joining", "Address");
        e1.display();
        e2.display();
        e3.display();
    }
}