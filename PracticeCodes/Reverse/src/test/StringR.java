package test;
import java.util.*;
public class StringR 
{
	String rev(String s1)
	{
		if(s1.length()==0)
			return " ";
		return s1.charAt(s1.length()-1)+rev(s1.substring(0,s1.length()-1));
	}
	public static void main(String[] args)
	{
		StringR str=new StringR();
		Scanner s=new Scanner(System.in);
		String s1=s.next();
			System.out.println(str.rev(s1));
		
		s.close();
	}
}
