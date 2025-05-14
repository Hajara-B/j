import java.util.*;
public class matrix
{
    int p;
    int q;
    int r;
    int s;
    int[][] MatrixA;
    int[][] MatrixB;
    int[][] sumMatrix;
void display()
{
Scanner sc=new Scanner(System.in);
System.out.println("Ënter the number of rows for matrix A: ");
p=sc.nextInt();
System.out.println("Ënter the number of columns for matrix A: ");
q=sc.nextInt();
System.out.println("Ënter the number of rows for matrix B: ");
r=sc.nextInt();
System.out.println("Ënter the number of columns for matrix B: ");
s=sc.nextInt();
if(p!=r || q!=s)
{
    System.out.println("Matrix Addition is not possible!!");
    return;
}
MatrixA=new int[p][q];
MatrixB=new int[r][s];
sumMatrix=new int[p][q];
System.out.println("Enter the elements for MatrixA: ");
for(int i=0;i<p;i++)
{
    for(int j=0;j<q;j++)
    {
        MatrixA[i][j]=sc.nextInt();
    }
}
System.out.println("Enter the elemnts for MatrixB: ");
for(int i=0;i<r;i++)
{
    for(int j=0;j<s;j++)
    {
        MatrixB[i][j]=sc.nextInt();
    }
}
System.out.println("Sum of the matrix is: ");
{
    for(int i=0;i<p;i++)
    {
        for(int j=0;j<q;j++)
        {
            sumMatrix[i][j]=MatrixA[i][j]+MatrixB[i][j];
        }
        System.out.println();    
    }
    for(int i=0;i<p;i++)
    {
        for(int j=0;j<q;j++)
        {
            System.out.println(sumMatrix[i][j]);
        }
    }
    sc.close();
}
}
public static void main(String[] args) 
{
    matrix m=new matrix();
    m.display(); 
}    
}  


