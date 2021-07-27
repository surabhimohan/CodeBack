import java.util.Scanner;
class PinCheck
{
boolean k;
boolean verify(int pinNo)
{
switch(pinNo)
{
case 1234:
k=true;
break;
case 3456:
k=true;
break;
default:
System.out.println("Invalid pinNo");
}
return k;
}
}

class Withdraw
{

}

class Deposit
{

}

class DRef1
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.print("Enter the pinNo: ");
String pinNo=s.nextLine();
if(pinNo.length()==4)
{
PinCheck pc=new PinCheck();
boolean r=pc.verify(Integer.parseInt(pinNo));
if(r)
{
System.out.println("Choices");
System.out.println("1.Withdraw\n2.Deposit");
System.out.print("Enter choice: ");
int choice=Integer.parseInt(s.nextine());
switch(choice)
{
case 1://withdraw
System.out.print("Enter the amount: ");
int amt=Integer.parseInt(s.nextLine());
if(amt)
Withdraw w=new Withdraw();

case 2://Deposit
System.out.print("Enter the amount: ");
int amt=Integer.parseInt(s.nextLine());
Deposit d=new Deposit();
}
}
}
}
}