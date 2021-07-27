//Interface and ImpClass without name(anonymous ImpClass)

import java.util.*;
interface Arithmetic
{
public abstract void cal(int x,int y);
}
class Assignment12
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
Arithmetic add=new Arithmetic()
{
public void cal(int x,int y)
{
System.out.println("==add==");
System.out.println("sum: "+(x+y));
}
};
add.cal(v1,v11);
break;
case 2:
System.out.print("Enter val 1: ");
int v2=Integer.parseInt(s.nextLine());
System.out.print("Enter val 2: ");
int v22=Integer.parseInt(s.nextLine());
Arithmetic sub=new Arithmetic()
{
public void cal(int x,int y)
{
System.out.println("==subtract==");
System.out.println("sub: "+(x-y));
}
};
sub.cal(v2,v22);
break;
case 3:
System.out.print("Enter val 1: ");
int v3=Integer.parseInt(s.nextLine());
System.out.print("Enter val 2: ");
int v33=Integer.parseInt(s.nextLine());
Arithmetic mul=new Arithmetic()
{
public void cal(int x,int y)
{
System.out.println("==multiply==");
System.out.println("mul:"+(x*y));
}
};
mul.cal(v3,v33);
break;
}
}
}