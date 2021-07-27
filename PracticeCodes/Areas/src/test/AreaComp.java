package test;
import java.util.*;
public class AreaComp 
{
	public static void main(String[] args) 
	{
		try(Scanner s=new Scanner(System.in);)
		{
			System.out.print("circle radius:");
			int r=s.nextInt();
			double c=(r*r)*Math.PI;
			System.out.println("Area:"+c);
			System.out.print("triangle base and height:");
			int b=s.nextInt();
			int h=s.nextInt();
			float t=(b*h)/2;
			System.out.println("Area:"+t);
			System.out.print("square side:");
			int side=s.nextInt();
			int sq=side*side;
			System.out.println("Area:"+sq);
			if(c>t && c>sq)
				System.out.println("Area of circle is the lasgest..!!");
			else if(t>c && t>sq)
				System.out.println("Area of triangle is the largest..!!");
			else
				System.out.println("Area of square is the largest..!!");
		}
	}

}
