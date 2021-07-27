class Test
{
int a,b;
float add()
{
System.out.println("val of a: "+a);
System.out.println("val of b: "+b);
return a+b;
}
}
class Returntype
{
public static void main(String[] args)
{
Test t = new Test();
t.a=12;
t.b=23;
float c=t.add();
System.out.println(c);
}
}