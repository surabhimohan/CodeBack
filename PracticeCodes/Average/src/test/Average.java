package test;
import java.util.*;
public class Average 
{
	public static void main(String[] args)
	{
		float avg,sum=0;
		int m;
		try(Scanner s=new Scanner(System.in);)
		{
			System.out.print("enter total elements:");
			int n=s.nextInt();
			System.out.println("enter the elements:");
			for(int i=1;i<=n;i++)
			{
				m=s.nextInt();
				sum=sum+m;				
			}
			avg=sum/(float)n;
			System.out.println("average of "+n+" is: "+avg);
		}
	}

}
