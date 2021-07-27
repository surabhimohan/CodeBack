import java.util.*;
interface IComparable
{
public abstract int compareTo(int x,int y);
}

class Greater implements IComparable
{
public int compareTo(int x,int y)
{
if(x>y)
return x;
else
return y;
}
}

class Smaller implements IComparable
{
public int compareTo(int x,int y)
{
if(x<y)
return x;
else
return y;
}
}

class Interface2
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.print("Enter value 1: ");
int v1=Integer.parseInt(s.nextLine());
System.out.print("Enter value 2: ");
int v2=Integer.parseInt(s.nextLine());
System.out.println("==Choose From==");
System.out.println("1.Greater\n2.Smaller");
System.out.print("Enter choice: ");
int choice=Integer.parseInt(s.nextLine());
switch(choice)
{
case 1:
Greater gt=new Greater();
System.out.println("Greater: "+gt.compareTo(v1,v2));
break;
case 2:
Smaller sm=new Smaller();
System.out.println("Smaller: "+sm.compareTo(v1,v2));
break;
default:
System.out.println("Invalid Choice..!!");
}
}
}