package test;
import java.util.*;
public class Odd_Even 
{
	public static void main(String[] args) 
	{
		try(Scanner s=new Scanner(System.in);)
		{
			System.out.println("no. of elements:");
			int n=s.nextInt();
			System.out.print("odd:");
			for(int i=1;i<=n;i++)
			{
				if(i%2!=0)
					System.out.print(i+" ");
			}
			System.out.println();
			System.out.print("even:");
			for(int i=1;i<=n;i++)
			{
				if(i%2==0)
					System.out.print(i+" ");
			}
		}
	}

}
