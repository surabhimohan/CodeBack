package test;
import java.util.*;
public class Pos_Neg 
{
	public static void main(String[] args) 
	{
		try(Scanner s=new Scanner(System.in);)
		{
			int m=0;
			System.out.print("total no. of elements:");
			int n=s.nextInt();
			System.out.println("enter elements:");
			for(int i=1;i<=n;i++)
			{
				m=s.nextInt();
			}
					
			System.out.println("+ve elements:");
			while(m>0)
			{
					System.out.println(m);
			}
			while(m<0)
			{
				System.out.println("-ve elements:");
				System.out.println(m);
			}
		}
	}

}
