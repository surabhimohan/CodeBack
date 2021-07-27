// DEFAULT CONSTRUCTOR

class Test
{
int add(int a,int b)
{
System.out.println("add");
return(a+b);
}
}
class Default
{
public static void main(String[] args)
{
Test t=new Test();
int c=t.add(1,2);
System.out.println(c);
}
}