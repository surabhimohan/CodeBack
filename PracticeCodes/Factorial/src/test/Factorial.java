package test;
import java.util.*;
public class Factorial 
{
	public static void main(String[] args) 
	{
		int fact=1;
		try(Scanner s=new Scanner(System.in);)
		{
			System.out.println("enter no. for factorial:");
			int n=s.nextInt();
			for(int i=1;i<=n;i++)
			{
				fact=fact*i;
			}
			System.out.println("Factorial of "+n+": "+fact);
		}
	}

}
