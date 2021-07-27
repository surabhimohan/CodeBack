package test;
import java.util.*;
public class Armstrong 
{
	public static void main(String[] args)
	{
		int c=0,a,b;
		try(Scanner s=new Scanner(System.in);)
		{
			System.out.println("enter the no:");
			int n=s.nextInt();
			b=n;
			while(n>0)
			{
			a=n%10;
			n=n/10;
			c=c+(a*a*a);	
			}
			if(b==c)
				System.out.println("no. is armstrong");
			else
				System.out.println("no. is not armstrong");
		}
	}

}
