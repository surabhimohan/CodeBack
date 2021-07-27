import java.util.*;
class PinCheck
{
boolean p;
boolean verify(String pinNo)
{
switch(pinNo)
{
case "1111":
p=true;
break;
case "2222":
p=true;
break;
default:
p=false;
}
return p;
}
}

class Balance
{
double bal=2000;
void getBal()
{
System.out.println("Balance Amount: "+bal);
}
}

class Withdraw
{
Balance b1;
Withdraw(Balance b1)
{
this.b1=b1;
}
void wDraw(int amt)
{
if(amt<=)
}
}

class Deposit
{

}

class DRef1
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in)
System.out.print("Enter the pinNo: ");
String pinNo=s.nextLine();
if(pinNo.length()==4)
{
PinCheck pc=new PinCheck();
boolean x=pc.verify();
if(x)
{
System.out.println("===CHOOSE FROM===");
System.out.println("1.WITHDRAW\n2.DEPOST");
System.out.print("Enter the choice: ");
int choice=Integer.parseInt(s.nextLine());
switch(choice)
{
Withdraw w=new Withdraw();
}
}
Balance b=new Balance();
b.getBal();

Deposit d=new Deposit();
}
}