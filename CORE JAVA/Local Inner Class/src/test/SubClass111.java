package test;

public class SubClass111 
{
	public int a=10;
	public static int b=20;
	public void m1()
	{
		 class SubClass222
		{
			public void m2()
			{
			System.out.println("==Local InnerClass m2()==");
			System.out.println("The value a: "+a);
			System.out.println("The value b: "+b);
			}
		}
		SubClass222 ob2=new SubClass222();
		ob2.m2();
	}

}
