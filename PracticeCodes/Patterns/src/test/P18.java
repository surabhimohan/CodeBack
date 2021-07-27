package test;
import java.util.*;
public class P18 
{
	public static void main(String[] args) 
	{
		try(Scanner s=new Scanner(System.in);)
		{
			System.out.print("enter no.of rows:");
			int n=s.nextInt();
			for(int i=1;i<=n;i++)
			{
				for(int j=2;j<=i;j++)
				{
					System.out.print(" ");
				}
				for(int k=2*n;k>(2*i)-1;k--)
				{
					if(k>1 && k>=(2*i))
						System.out.println();
				}
				System.out.println();
			}
		}
	}

}
