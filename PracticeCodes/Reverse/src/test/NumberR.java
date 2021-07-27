package test;
import java.util.*;
public class NumberR 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=Integer.parseInt(s.nextLine());
		int a,b=0;
		while(n>0)
		{
			a=n%10;
			b=(b*10)+a;
			n=n/10;
		}
		System.out.println("reverse:"+b);
		s.close();
	}

}
