package test;
import java.util.*;
public class P3 
{
	public static void main(String[] args) 
	{
		try(Scanner s=new Scanner(System.in);)
		{
			System.out.print("enter no. of rows:");
			int n=s.nextInt();
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(" ");
				}
				for(int k=n;k>=i;k--)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

}
