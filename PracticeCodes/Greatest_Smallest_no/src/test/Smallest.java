package test;
import java.util.*;
public class Smallest 
{
	public static void main(String[] args) 
	{
		int smallest=0,num;
		try(Scanner s=new Scanner(System.in);)
		{
			System.out.println("total comparing numbers:");
			int n=s.nextInt();
			System.out.println("enter the digits:");
		    num=s.nextInt();
			smallest=num;//assuming 1st no. as the smallest
			for(int i=2;i<=n;i++)
			{
				num=s.nextInt();
				if(num<smallest)
					smallest=num;
			}
		}
		System.out.println("smallest no is: "+smallest);
	}
}
