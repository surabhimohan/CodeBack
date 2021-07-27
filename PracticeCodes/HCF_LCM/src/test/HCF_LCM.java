package test;
import java.util.*;
public class HCF_LCM 
{
	public static void main(String[] args) 
	{
		int num,den,rem,hcf,lcm;
		try(Scanner s=new Scanner(System.in);)
		{
			System.out.print("enter numbers:");
			int n1=s.nextInt();
			int n2=s.nextInt();
			if(n1>n2)
			{
				 num=n1;
				 den=n2;
			}
			else
			{
				num=n2;
				den=n1;
			}
			rem=num%den;
			while(rem!=0)
			{
				num=den;
				den=rem;
				rem=num%den;
			}
			hcf=den;
			lcm=(n1*n2)/hcf;
			System.out.println("hcf of "+n1+"&"+n2+" is: "+hcf);
			System.out.println("lcm of "+n1+"&"+n2+" is: "+lcm);
		}
	}

}
