package test;

public class SubClass1 
{
	public int a=10;
	public static int b=20;
	public class SubClass2 //member inner class
	{
		public void m2()
		{
			System.out.println("==InnerClass m2()==");
			System.out.println("The value a: "+a);
			System.out.println("The value b: "+b);
		}
	}

}
