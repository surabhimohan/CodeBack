import java.util.*;
class PinCheck
{
boolean k;
boolean verify(int PinNo)
{
}
}

class Balance
{
double bal=2000;
void getBal()
{
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
if(amt<=b1.bal)
{
System.out.println("Amount Withdrawn: "+amt);
b1.bal=b1.bal-amt;
b1.getBal();
System.out.println("Transaction completed.."); 
}
else
{
System.out.println("Insufficient Fund");
}
}
}

class Deposit
{
Balance b1;
Deposit(Balance b1)
{
this.b1=b1;
}
void deposit(int amt)
{
System.out.println("Amount Deposited: "+amt);
b1.bal=b1.bal+amt;
b1.getBal();
System.out.println("Transaction Completed");
}
}

class DRef1
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
Balance b=new Balance();
int count=0;
xyz:
while(true)
{
System.out.print("Enter the PinNo: ");
String pNo=s.nextLine();
if(pNo.length()==4)
{
PinCheck pc=new PinCheck();
boolean z=pc.verify(Integer.parseInt(pNo));
if(z)
{
System.out.println("CHOOSE FROM...");
System.out.println("1.WITHDRAW\n2.DEPOSIT");
System.out.print("Enter the choice: ");
int choice=Integer.parseInt(s.nextLine());
switch(choice)
{
case 1:
System.out.print("Enter the amount: ");
int a1=Integer.parseInt(s.nextLine());
if(a1>0 && a1%100==0)
{
Withdraw wd=new Withdraw(b);
wd.wDraw(a1);
}
else
{
System.out.println("Invalid amount..");
}
break xyz;
case 2:
System.out.print("Enter amount: ");
int a2=Integer.parseInt(s.nextLine());
if(a2>0 && a2%100==0)
{
Deposit d1=new Deposit();
d1.deposit(a2);
}
else
{
Sytem.out.println("Invalid amount..");
}
break xyz;
default:
System.out.println("Invalid choice..");
break xyz;
}
}
else
{
System.out.println("PinNo does not exist..");
count++;
}
}
else
{
System.out.println("Invalid PinNo..");
count++;
}
if(count==3)
{
System.out.println("Sorry! Transaction Blocked..");
break xyz;
}
}
}