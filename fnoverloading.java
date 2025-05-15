// Function Overloading
import java.util.*;
class fnoverloading
{
    Scanner sc=new Scanner(System.in);

    void area(double r)
    {
        System.out.println("Area of circle: "+3.14*r*r);

    }
    void area(double b,double h)
    {
        System.out.println("Area of triangle: "+.5*b*h);
      
    }
    void area(int a)
    {
        System.out.println("Area of square: "+a*a);
        
    }
    void area(int l ,int w)
    {
        System.out.println("Area of rectangle: "+l*w);
        
    }
}
    class shapes
    {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        fnoverloading s=new fnoverloading();

        System.out.println("Enter the radius of circle: ");
        double r=sc.nextDouble();
        s.area(r);

        System.out.println("Enter the base and height of triangle: ");
        double b=sc.nextDouble();
        double h=sc.nextDouble();
        s.area(b,h);
        

        System.out.println("Enter the side of square: ");
        int a=sc.nextInt();
        s.area(a);

        System.out.println("Enter the length and width of rectangle: ");
        int l=sc.nextInt();
        int w=sc.nextInt();
        s.area(l,w);
    }
}

