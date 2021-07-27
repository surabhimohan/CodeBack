class Product
{
String pName,pCode;
int pPrice,pQty;
void getProduct()
{
System.out.println("ProductName     : "+pName);
System.out.println("ProductCode     : "+pCode);
System.out.println("ProductPrice(Rs): "+pPrice);
System.out.println("ProductQty(kg)  : "+pQty);
}
}

class Assignment1
{
public static void main(String[] args)
{
Product p=new Product();
p.pName="Brown Sugar";
p.pCode="12345678910";
p.pPrice=500;
p.pQty=3;
p.getProduct();
}
}