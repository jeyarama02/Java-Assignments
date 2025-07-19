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