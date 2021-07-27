import java.util.*;
interface Arithmetic
{
public abstract void cal(int x,int y);
}

class Addition implements Arithmetic
{
public void cal(int x,int y)
{
System.out.println("==Add==");
System.out.println("Sum: "+(x+y));
}
}
class Subtraction implements Arithmetic
{
public void cal(int x,int y)
{
System.out.println("==Subtract==");
System.out.println("Sub: "+(x-y));
}
}
class Multiplication implements Arithmetic
{
public void cal(int x,int y)
{
System.out.println("==Multiply==");
System.out.println("Mul: "+(x*y));
}
}

class Assignment10
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("==CHOOSE FROM==");
System.out.println("1.Addition\n2.Subtraction\n3.Multiplication");
System.out.print("Enter the choice: ");
int choice=Integer.parseInt(s.nextLine());
switch(choice)
{
case 1:
Addition add=new Addition();
System.out.print("Enter val 1: ");
int v1=Integer.parseInt(s.nextLine());
System.out.print("Enter val 2: ");
int v11=Integer.parseInt(s.nextLine());
add.cal(v1,v11);
break;
case 2:
Subtraction sub=new Subtraction();
System.out.print("Enter val 1: ");
int v2=Integer.parseInt(s.nextLine());
System.out.print("Enter val 2: ");
int v22=Integer.parseInt(s.nextLine());
sub.cal(v2,v22);
break;
case 3:
Multiplication mul=new Multiplication();
System.out.print("Enter val 1: ");
int v3=Integer.parseInt(s.nextLine());
System.out.print("Enter val 2: ");
int v33=Integer.parseInt(s.nextLine());
mul.cal(v3,v33);
break;
default:
System.out.println("Invalid choice..!!");
}
}
}