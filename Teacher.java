// Single Inheritance
import java.util.*;
class Employee
{
    int Empid;
    String name,address;
    double salary;
     
    Employee(int x)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Details of "+x+"Teachers: ");

        System.out.println("Enter the Employee id :");
        Empid=sc.nextInt();

        System.out.println("Enter the Employee name :");
        name=sc.next();

        System.out.println("Enter the Employee address :");
        address=sc.next();

        System.out.println("Enter the Employee salary :");
        salary=sc.nextDouble();
        
    }
}
class Teacher extends Employee
{
    String dept,Sub[];
    int no;

    Teacher(int x)
    {
        super(x);
        Scanner sc=new Scanner(System.in);

    System.out.println("Enter the department of the teacher :");
    dept=sc.next();

    System.out.println("Enter the no of subjects :");
    no=sc.nextInt();

    Sub=new String[no];

    System.out.println("Enter the subjects: ");
    for(int i=0;i<no;i++)
    {
        Sub[i]=sc.next();
    }
}
     void display(int x)
     {
        Scanner sc=new Scanner(System.in);

        System.out.println("Teacher"+x+"Details");

        System.out.println("Employee id="+Empid);
        System.out.println("Employee name="+name);
        System.out.println("Employee salary="+salary);
        System.out.println("Employee address="+address);
        System.out.println("Employee department="+dept);
        System.out.println("Employee subjects=");
        for(int i=0;i<no;i++)
        {
            System.out.println(Sub[i]);
        }
     }
}
class main
{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of teachers: ");
        int n=sc.nextInt();
        Teacher t[]=new Teacher[n];
        for(int i=0;i<n;i++)
        {
            t[i]=new Teacher(i+1);
        }
        for(int i=0;i<n;i++)
        {
            t[i].display(i+1);
        }

    }
}