import java.util.*;
import java.lang.*;
class Product
{
String pCode,pName;
float pPrice;
int pQty;
void getProduct()
{
System.out.println("Product Code:"+pCode);
System.out.println("Product Name:"+pName);
System.out.println("Product Price:"+pPrice);
System.out.println("Product Quantity:"+pQty);
}
}

class MainClass2
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
Product p=new Product();
//method>public String nextLine();
//syntax>String str=s.nextLine();
System.out.print("Enter the product code:");
p.pCode=s.nextLine();
System.out.print("Enter the product name:");
p.pName=s.nextLine();
System.out.print("Enter the product price:");
p.pPrice=s.nextFloat();
System.out.print("Enter the product quantity:");
p.pQty=s.nextInt();
p.getProduct();
}
}