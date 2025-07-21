class EmployeeClass {
    String name;
    int empId;
    String designation;
    double salary;

    EmployeeClass() {
        System.out.println("Object created using no-arg constructor");
        name = "Default";
        empId = 0;
        designation = "None";
        salary = 0.0;
    }

    EmployeeClass(String name, int empId, String designation, double salary) {
        this.name = name;
        this.empId = empId;
        this.designation = designation;
        this.salary = salary;
    }

    EmployeeClass(EmployeeClass e) {
        this.name = e.name;
        this.empId = e.empId;
        this.designation = e.designation;
        this.salary = e.salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Emp ID: " + empId);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
        System.out.println();
    }

    public static void main(String[] args) {
        EmployeeClass e1 = new EmployeeClass();
        EmployeeClass e2 = new EmployeeClass("Alice", 101, "Manager", 55000);
        EmployeeClass e3 = new EmployeeClass(e2);

        e1.display();
        e2.display();
        e3.display();
    }
}