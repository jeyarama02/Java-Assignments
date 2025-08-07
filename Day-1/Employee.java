/*Write a class Employee with attributes empId, name, department and salary and define a parameterized constructor
Employee(int empId, String name, String department, double salary) and assign these variables to instance variables
accordingly and display them? Learn variable shadowing*/
public class Employee
{
    int EmpId;
    String EmpName;
    String EmpDept;
    double EmpSalary;
    Employee(int id,int salary,String name,String dept)
    {
         EmpId=id;
         EmpName=name;
         EmpDept=dept;
        EmpSalary=salary;
    }
    public static void main(String args[])
    {
        Employee one=new Employee(32,100000000,"jeyaram","bca");
        System.out.println(one.EmpDept);
        System.out.println(one.EmpId);
        System.out.println(one.EmpName);
        System.out.println(one.EmpSalary);
    }

}
