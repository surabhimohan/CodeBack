package test;
import java.util.*;
public class Fibonacci 
{
	public static void main(String[] args) 
	{
		try(Scanner s=new Scanner(System.in);)
		{
			System.out.println("enter no.of elements:");
			int n=s.nextInt();
			System.out.println("enter 1st element:");
			int n1=s.nextInt();
			System.out.println("enter 2nd element:");
			int n2=s.nextInt();
			for(int i=1;i<=n;i++)
			{
				System.out.print(n1+ " ");
				int sum=n1+n2;
				n1=n2;
				n2=sum;
			}
		}
	}

}
