import java.util.*;
class MainClass9
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.print("Enter the number: ");
int num=Integer.parseInt(s.nextLine());
double d=Math.sqrt(num);
System.out.println("SquareRoot of "+num+ " is: "+d);
}
}