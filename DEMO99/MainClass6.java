import java.lang.*;
import java.util.*;
class Addition
{
void add(int x,int y)
{
System.out.println("ADD :"+(x+y));
}
}
class Subtraction
{
void sub(int x,int y)
{
System.out.println("SUB :"+(x-y));
}
}
class Multiplication
{
void mul(int x,int y)
{
System.out.println("MUL :"+(x*y));
}
}
class Division
{
void div(int x,int y)
{
System.out.println("DIV :"+(float)x/y);
}
}
class ModDivision
{
void modDiv(int x,int y)
{
System.out.println("MOD-DIV :"+(x%y));
}
}
class MainClass6
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.print("Enter the value of v1: ");
int v1=Integer.parseInt(s.nextLine());
System.out.print("Enter the value of v2: ");
int v2=Integer.parseInt(s.nextLine());
System.out.println("==CHOOSE FROM==");
System.out.println("1.ADD\n2.SUB\n3.MUL\n4.DIV\n5.MOD-DIV");
System.out.print("Enter the choice: ");
int choice=Integer.parseInt(s.nextLine()); 
switch(choice)
{
case 1:
Addition a=new Addition();
a.add(v1,v2);
break;
case 2:
Subtraction su=new Subtraction();
su.sub(v1,v2);
break;
case 3:
Multiplication m=new Multiplication();
m.mul(v1,v2);
break;
case 4:
Division d=new Division();
d.div(v1,v2);
break;
case 5:
ModDivision md=new ModDivision();
md.modDiv(v1,v2);
break;
default:
System.out.println("****Invalid Choice****");
}
}
}
