//Abstract Class in java

import java.util.*;
abstract class Calculate
{
double x,y;  //instance var
Calculate(double x)  //constructor
{
this.x=x;
}
void cal()  //concrete method
{
y=Math.sqrt(x);
}
abstract void dis(); //abstract method
}

class Display extends Calculate
{
Display(double x)
{
super(x);
}
public void dis()
{
System.out.println("Sqrt of  "+x+"  is: "+y);
}
}
class AbsClass
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.print("Enter val x: ");
double x=Double.parseDouble(s.nextLine());
Display d=new Display(x);
d.cal();
d.dis();
}
}