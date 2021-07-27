import java.lang.*;
import java.util.*;
class BookDetails
{
String bName,bAuthor,bCode;
float bPrice;
int bQty;
void getBookDetails()
{
System.out.println("Book Name:"+bName);
System.out.println("Book Author:"+bAuthor);
System.out.println("Book Code:"+bCode);
System.out.println("Book Price(Rs):"+bPrice);
System.out.println("Book Qty(gm):"+bQty);
}
}

class Assignment2
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in); 
BookDetails bd=new BookDetails();
System.out.print("Enter the book name: ");
bd.bName=s.nextLine();
System.out.print("Enter the book author: ");
bd.bAuthor=s.nextLine();
System.out.print("Enter the book code: ");
bd.bCode=s.nextLine();
System.out.print("Enter the book price: ");
bd.bPrice=Float.parseFloat(s.nextLine());
System.out.print("Enter the book quantity: ");
bd.bQty=Integer.parseInt(s.nextLine());
bd.getBookDetails();
}
}