import java.util.*;
class PClass
{
void add(int x,int y)
{
System.out.println("==PClass==");
System.out.println("Sum: "+(x+y));
}
}
class CClass extends PClass
{
void add(int x,int y,int z)
{
System.out.println("==CClass==");
System.out.println("Sum: "+(x+y+z));
}
}
class Inheritance3ovrldng
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
CClass c=new CClass();
System.out.println("==Choose From==");
System.out.println("1.Sum of two values\n2.Sum of three values");
System.out.print("Enter the choice: ");
int choice=Integer.parseInt(s.nextLine());
switch(choice)
{
case 1:
System.out.print("Enter val 1: ");
int v1=Integer.parseInt(s.nextLine());
System.out.print("Enter val 2: ");
int v2=Integer.parseInt(s.nextLine());
c.add(v1,v2);
break;

case 2:
System.out.print("Enter val 1: ");
int v11=Integer.parseInt(s.nextLine());
System.out.print("Enter val 2: ");
int v22=Integer.parseInt(s.nextLine());
System.out.print("Enter val 3: ");
int v33=Integer.parseInt(s.nextLine());
c.add(v11,v22,v33);
break;

default:
System.out.println("Invalid choice..");
}
}
}