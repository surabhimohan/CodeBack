// generalization process

class PClass
{
void m1(int x)
{
System.out.println("PClass");
System.out.println("val x: "+x);
}
void m2(int y)
{
System.out.println("PClass");
System.out.println("val y: "+y);
}
}

class CClass extends PClass
{
void m1(int x)
{
System.out.println("CClass");
System.out.println("val x: "+x);
}
void m3(int z)
{
System.out.println("CClass");
System.out.println("val z: "+z);
}
}

class Inheritance4
{
public static void main(String[] args)
{
PClass p=new CClass();
p.m1(12);
p.m2(23);
//p.m3(34);
}
}
