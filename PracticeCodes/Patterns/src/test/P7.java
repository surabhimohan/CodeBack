package test;
import java.util.*;
public class P7 
{
	public static void main(String[] args) 
	{
		try(Scanner s=new Scanner(System.in);)
		{
			System.out.print("enter no. of rows:");
			int n=s.nextInt();
			for(int i=1;i<=n;i++)
			{
				for(int j=n;j>=(2*i)-1;j--)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

}
