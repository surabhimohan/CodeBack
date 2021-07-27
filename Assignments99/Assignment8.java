import java.util.*;
class PinCheck
{
boolean k;
boolean verify(String pinNo)
{
switch(pinNo)
{
case "1111":
k=true;
break;
case "2222":
k=true;
break;
case "3333":
k=true;
break;
}
return k;
}
}
class Withdraw
{
void wdraw(int amt)
{
System.out.println("Amount withdrawn: "+amt);
}
}
class Deposit
{
void deposit(int amt)
{
System.out.println("Amount deposited :"+amt);
}
}
class Assignment8
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.print("Enter the pinNo: ");
String pinNo=s.nextLine();
if(pinNo.length()==4)
{
PinCheck pc=new PinCheck();
boolean b=pc.verify(pinNo);
if(b)
{
System.out.println("==CHOOSE FROM==");
System.out.println("1.WITHDRAW\n2.DEPOSIT");
System.out.print("Enter the choice: ");
int choice=Integer.parseInt(s.nextLine());
System.out.print("Enter the amount: ");
int amt=Integer.parseInt(s.nextLine());
if(amt<5000)
{
switch(choice)
{
case 1:
Withdraw w=new Withdraw();
w.wdraw(amt);
break;
case 2:
Deposit d=new Deposit();
d.deposit(amt);
break;
}
}
if(amt>=0 && amt%100==0)
{
System.out.println("TRANSACTION COMPLETED..!!");
}
}
else
{
System.out.println("invalid pinNo");
}
}
}
}