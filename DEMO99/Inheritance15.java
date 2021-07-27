class PClass
{
static void m(int x)
{
System.out.println("==PClass==");
System.out.println("val of x: "+x);
}
}
class CClass extends PClass
{
static void m(int y,int z)
{
System.out.println("==CClass==");
System.out.println("val of y: "+y); 
System.out.println("val of z: "+z); 
}
}
class Inheritance15
{
public static void main(String[] args)
{
CClass.m(123);
CClass.m(124,234);
Inheritance15.main(90);
for(String k:args) //args is the container
{
System.out.println(k);
}
}
public static void main(float p) //static method overload
{
System.out.println("==overloaded main()==");
System.out.println("val of p: "+p);
}
}