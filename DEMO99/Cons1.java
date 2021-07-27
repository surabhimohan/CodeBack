// CONSTRUCTORS WITHOUT PARAMETERS

class Test
{
Test()  //constructor without para
{
System.out.println("==Constructor==");
} 
void add(int x,int y) //method
{
System.out.println("Sum: "+(x+y));
}
}

class Cons1
{
public static void main(String[] args)
{
Test t=new Test(); //cons call
t.add(2,3); //method call
}
}