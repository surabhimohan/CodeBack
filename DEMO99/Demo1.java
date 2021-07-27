class Demo
{
int x;
int y;
int m(int x,int y)
{
this.x=x;
this.y=y;
System.out.println("sum: "+(x+y));
return x+y;
}
}
class Demo1
{
public static void main(String[] args)
{
Demo d=new Demo();
d.m(10,20);
}
}