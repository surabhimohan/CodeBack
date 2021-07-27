//Func_Interface and Method Reference Model

import java.util.*;
interface Arithmetic
{
public abstract void cal(int x,int y);
}
class Addition
{
Addition(int a,int b)
{
System.out.println("==add==");
System.out.println("Sum: "+(a+b));
}
}
class Subtraction
{
void sub(int c,int d)
{
System.out.println("==subtract==");
System.out.println("Sub: "+(c-d));
}
}
class Multiplication
{
static void mul(int e,int f)
{
System.out.println("==multiply==");
System.out.println("Mul: "+(e*f));
}
}
class Assignment11
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("==CHOOSE FROM==");
System.out.println("1.Addition\n2.Subtraction\n3.Multiplication");
System.out.print("Enter choice: ");
int choice=Integer.parseInt(s.nextLine());
switch(choice)
{
case 1:
System.out.print("Enter val 1: ");
int v1=Integer.parseInt(s.nextLine());
System.out.print("Enter val 2: ");
int v11=Integer.parseInt(s.nextLine());
Arithmetic ob1=Addition::new;
ob1.cal(v1,v11);
break;
case 2:
System.out.print("Enter val 1: ");
int v2=Integer.parseInt(s.nextLine());
System.out.print("Enter val 2: ");
int v22=Integer.parseInt(s.nextLine());
Arithmetic ob2=new Subtraction()::sub;
ob2.cal(v2,v22);
break;
case 3:
System.out.print("Enter val 1: ");
int v3=Integer.parseInt(s.nextLine());
System.out.print("Enter val 2: ");
int v33=Integer.parseInt(s.nextLine());
Arithmetic ob3=Multiplication::mul;
ob3.cal(v3,v33);
break;
}
}
}