package maccess;
import test.SubClass1;
public class MainClass1 
{
	public static void main(String[] args) 
	{
		SubClass1 ob1=new SubClass1();
		SubClass1.SubClass2 ob2 = ob1.new SubClass2(); //link b/w objects
		ob2.m2();		
	}

}
