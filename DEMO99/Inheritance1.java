/*Non Static members of PClass
 =============================*/


import java.util.Scanner;

class PClass
{
int x;
void m1()
{
System.out.println("val of x:"+x);
}
}

class CClass extends PClass
{
int y;
void m2()
{
System.out.println("val of y:"+y);
}
}

class Inheritance1
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter x:");
int x=s.nextInt();
System.out.println("enter y:");
int y=s.nextInt();
CClass c=new CClass();
c.x=x;
c.y=y;
c.m1();
c.m2();
}
}
