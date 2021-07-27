package test;
import java.util.*;
public class P15 
{
	public static void main(String[] args) 
	{
		try(Scanner s=new Scanner(System.in);)
		{
			System.out.print("enter no.of rows:");
			int n=s.nextInt();
			for(int i=1;i<=n;i++)
			{
				for(int j=n;j>=i;j--)
				{
					if(i<n && j>i)
						System.out.print(" ");
					else
						System.out.print("*");
				}
				System.out.println();
			}
		}
	}

}