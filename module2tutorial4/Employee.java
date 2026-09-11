
package module2;
import java.util.Scanner;

class Employee
{
    int empId;
    String empName;
    double salary;

    Employee(int id, String name, double sal)
    {
        empId = id;
        empName = name;
        salary = sal;
    }

    void displayEmployee()
    {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee 1 ID: ");
        int id1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee 1 Name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter Employee 1 Salary: ");
        double sal1 = sc.nextDouble();

        Employee e1 = new Employee(id1, name1, sal1);

        System.out.print("Enter Employee 2 ID: ");
        int id2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee 2 Name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter Employee 2 Salary: ");
        double sal2 = sc.nextDouble();

        Employee e2 = new Employee(id2, name2, sal2);

        System.out.println("\nEmployee 1 Details:");
        e1.displayEmployee();

        System.out.println("\nEmployee 2 Details:");
        e2.displayEmployee();
    }
}
