package maccess;
import p1.IArithmetic;
import p2.*;
import java.util.Scanner;

public class MainClass 
{
	public static void main(String[] args) 
	{
Scanner s = new Scanner(System.in);
System.out.print("Enter val 1: ");
int v1=Integer.parseInt(s.nextLine());
System.out.print("Enter val 2: ");
int v2=Integer.parseInt(s.nextLine());
System.out.println("==Choose From==");
System.out.println("1.Addition\n2.Subtraction\n3.Multiplication");
System.out.print("Enter choice: ");
int choice=Integer.parseInt(s.nextLine());
switch(choice)
{
case 1:
	IArithmetic ob1=new Addition()::add;
	ob1.cal(v1,v2);
	break;
case 2:
	IArithmetic ob2=new Subtraction()::sub;
	ob2.cal(v1,v2);
	break;
case 3:
	IArithmetic ob3=new Multiplication()::mul;
	ob3.cal(v1,v2);
	break;
	default:
		System.out.println("Invalid Choice..!!");
}
s.close();
	}
}
