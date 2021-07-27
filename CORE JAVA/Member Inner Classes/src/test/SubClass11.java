package test;
public class SubClass11
{
	public int x=10;
	public static int y=20;
	public static SubClass11 a;
	public static class SubClass22
	{
		public void m2()
		{
			System.out.println("==InnerClass m2()==");
			System.out.println("The value x: "+a.x);
			System.out.println("The value y: "+y);
		}
		public static void m22()
		{
			System.out.println("==InnerClass m22()==");
			System.out.println("The value x: "+a.x);
			System.out.println("The value y: "+y);
		}
	}
}
