package test;
import java.util.*;
public class NumberP
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int b=n;
		int sum=0;
		while(n>0)
		{
		int a=n%10;
		sum=(sum*10)+a;
		n=n/10;
		}
		if(b==sum)
			System.out.println("is Palindrome");
		else
			System.out.println("not Palindrome");
		s.close();
	}

}
