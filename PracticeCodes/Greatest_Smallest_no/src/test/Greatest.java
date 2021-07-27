package test;
import java.util.*;
public class Greatest {

	public static void main(String[] args) 
	{
		int num,greatest=0;
		try(Scanner s=new Scanner(System.in);)
		{
			System.out.println("total comparing numbers:");
			int n=s.nextInt();
			System.out.println("enter the numbers:");
			num=s.nextInt();
			greatest=num;//assuming 1st no. as the greatest
			for(int i=2;i<=n;i++)
			{
				num=s.nextInt();
				if(num>greatest)
					greatest=num;
			}
		}
		System.out.println("Greatest no is: "+greatest);
	}

}
