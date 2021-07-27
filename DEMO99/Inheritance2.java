/*Method Overriding
===================*/
import java.util.Scanner;
class PClass
{
void m(int x)
{
System.out.println("parent class");
System.out.println("val of x:"+x);
}
}

class CClass extends PClass
{
void m(int x)
{
System.out.println("child class");
System.out.println("val of x:"+x);
}
}

class Inheritance2
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter x:");
int x=s.nextInt();
CClass c=new CClass();
c.m(x);
}
}