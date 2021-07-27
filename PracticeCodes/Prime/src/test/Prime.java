package test;
import java.util.*;
public class Prime 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=s.nextInt();
		boolean result=true;
		//0 and 1 are not prime numbers
		if(n==0 && n==1)
			System.out.println("not prime");
		else
		{
   //2 is the only even prime no.and no.is divisible by more than half of the no.
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println("not prime");
				result=false;
				break;
			}
		}
		if(result)
			System.out.println("is prime");
		}
		s.close();
	}

}
