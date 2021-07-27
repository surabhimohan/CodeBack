/*Method Reference Concept
============================*/

interface IDisplay  //functional interface
{
public abstract void dis(int x);
}
class Test 
{
Test(int a) //method reference to constructor
{
System.out.println("==Test()==");
System.out.println("value a: "+a);
}
}
class Access1
{
void m1(int b)  //method reference to instance method
{
System.out.println("==m1()==");
System.out.println("value b: "+b);
}
}
class Access2
{
static void m2(int c)  //method reference to static method
{
System.out.println("==m2()==");
System.out.println("value c: ");
}
}
class Interface6
{
public static void main(String[] args)
{
IDisplay id1=Test::new;
IDisplay id2=new Access1()::m1;
IDisplay id3=Access2::m2;
id1.dis(12);
id2.dis(13);
id3.dis(14);
}
}