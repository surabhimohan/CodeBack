package test;
import java.util.Arrays;
public class Anagram 
{
	public void isAnagram(String s1,String s2)
	{
		String str1=s1.toLowerCase();
		String str2=s2.toLowerCase();
		String str3=str1.replaceAll("\\s+", "");
		String str4=str2.replaceAll("\\s+", "");
		boolean result=true;
		if(str1.length()!=str2.length()&&str3.length()!=str4.length())
			result=false;
		else
		{
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
	    result=Arrays.equals(ch1, ch2);
		}
		if(result)
			System.out.println(s1+" and "+s2+" are anagram strings");
		else
			System.out.println(s1+" and "+s2+" are not anagram strings");			
	}
	public static void main(String[] args)
	{
		Anagram an=new Anagram();
		an.isAnagram("spar","rasp");
	}
}
