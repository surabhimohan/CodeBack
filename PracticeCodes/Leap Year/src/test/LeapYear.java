package test;
import java.util.Scanner;
public class LeapYear 
{
	public static void main(String[] args) 
	{
		try(Scanner s=new Scanner(System.in);)
		{
			System.out.print("enter the year:");
			int yr=s.nextInt();
			if(yr%4==0 && yr%100!=0 || yr%400==0)
				System.out.println(yr+" is a leap year");
			else
				System.out.println(yr+" is not a leap year");
		}
	}

}
